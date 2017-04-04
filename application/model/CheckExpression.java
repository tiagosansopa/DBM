package application.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckExpression extends DBMSBaseVisitor <ArrayList<String>>{
	public Integer notExpression;
	public boolean notCompareExpr;
	public DBmanagerDML dml;
	public ArrayList<String> rowX;
	public ArrayList<ArrayList<String>> resultX;
	public boolean pass;

	public CheckExpression (ArrayList<String> rowX, ArrayList<ArrayList<String>> resultX){
		System.out.println("DBMSVisitor");
		this.rowX = rowX;
		this.resultX = resultX;
		notExpression = 0;
		notCompareExpr = false;
	}
	public ArrayList<String> makeOr(ArrayList<String> row1, ArrayList<String> row2){
		if(row1 == null && row2 == null){
			return null;
		}
		return row1;
	}
	
	public ArrayList<String> makeAnd(ArrayList<String> row1, ArrayList<String> row2){
		if(row1 != null && row2 != null){
			return row1;
		}
		return null;
	}
	
	//Exp
	@Override
	public ArrayList<String> visitExp(DBMSParser.ExpContext ctx){
		//:   expression |   //epsilon
		if(ctx.expression() != null){
			ArrayList<String> temp  = new ArrayList<String>();
			temp = visitChildren(ctx);
			if(temp != null){
				this.pass = true;
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<String> visitExpression(DBMSParser.ExpressionContext ctx){
		/*expression 
    		:   andExpr
    		|   expression or andExpr*/
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			ArrayList<String> row1 = visit(ctx.expression());
			ArrayList<String> row2 = visit(ctx.andExpr());
			if(notExpression%2 != 0){
				return makeAnd(row1, row2);
			} else {
				return makeOr(row1, row2);
			}
		}
	}
	
	@Override
	public ArrayList<String> visitAndExpr(DBMSParser.AndExprContext ctx){
		/*andExpr
			: factor 
    		| andExpr and factor */
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			ArrayList<String> row1 = visit(ctx.andExpr());
			ArrayList<String> row2 = visit(ctx.factor());
			if(notExpression%2 != 0){
				return makeOr(row1, row2);
			} else {
				return makeAnd(row1, row2);
			}
		}
		
	}
	
	@Override
	public ArrayList<String> visitFactor(DBMSParser.FactorContext ctx){
		/*factor
    		: primaryExpr 
    		| not primaryExpr*/
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			if(ctx.getChild(1).getChildCount() == 1){
				notCompareExpr = true;
				return visitChildren(ctx);
			} else {
				notExpression += 1;
				ArrayList<String> temp = visitChildren(ctx);
				notExpression -= 1;
				return temp;
			}
		}
	}
	
	@Override
	public ArrayList<String> visitPrimaryExpr(DBMSParser.PrimaryExprContext ctx){
		/*primaryExpr
			: compareExpr
			| LPAREN expression RPAREN
			;*/
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			return visitChildren(ctx.expression());
		}
	}
	
	@Override
	public ArrayList<String> visitCompareExpr(DBMSParser.CompareExprContext ctx){
		/*	compareExpr
				:	term rel_op term
		 */
		
		/*term
			:	ID
			|	literal
		 
		 */
		System.out.println(ctx.getText());
		String term1 = ctx.getChild(0).getText();
		String term1_type = "";
		if(ctx.term(0).ID() == null){
			term1_type = type(term1);
			if(term1_type.length() > 3 && term1_type.substring(0, 4).equals("char")){
				term1 = term1.substring(1, term1.length()-1);
				term1_type = type(term1);
			}
		} 
		
		String term2 = ctx.getChild(2).getText();
		String term2_type = "";
		if(ctx.term(1).ID() == null){
			term2_type = type(term2);
			if(term2_type.length() > 3 && term2_type.substring(0, 4).equals("char")){
				term2 = term2.substring(1, term2.length()-1);
				term2_type = type(term2);
			}
		}

		String rel_op = ctx.rel_op().getText();
		
		System.out.println(term1);
		System.out.println(term2);
		System.out.println(rel_op);
		
		//NOT 
		if(notCompareExpr && notExpression%2 != 0){
			notCompareExpr = false;
		} else if (notExpression%2 != 0){
			rel_op = notCompareRel(rel_op);
		} else if (notCompareExpr){
			rel_op = notCompareRel(rel_op);
			notCompareExpr = false;
		}
		
		if(term1_type.equals("") && term2_type.equals("")){
			//PRODUCTO CRUZ
		} else if(term1_type.equals("")){
			//System.out.println(term1);
			Integer index_current_column = resultX.get(0).indexOf(term1);
			String current_column_type = resultX.get(1).get(index_current_column);
			String current_column_value = rowX.get(index_current_column);
			if(relation(rel_op, current_column_value, term2, current_column_type, term2_type)){
				return rowX;
			}
		} else if(term2_type.equals("")){
			//System.out.println(term2);
			Integer index_current_column = resultX.get(1).indexOf(term2);
			String current_column_type = resultX.get(0).get(index_current_column);
			String current_column_value = rowX.get(index_current_column);
			if(relation(rel_op, term1, current_column_value, term1_type, current_column_type)){
				return rowX;
			}
		}
		return null;
	}
	
	public String notCompareRel(String rel_op){
		String new_rel_op = "";
		switch (rel_op){
		case "<":
			return ">=";
		case ">":
			return "<=";
		case "<=":
			return ">";
		case ">=":
			return "<";
		case "<>":
			return "=";
		case "=":
			return "<>";
		}
		return new_rel_op;
	}
	
	public boolean relation(String op, String item1, String item2, String type1, String type2){
		if(type1.equals(type2)){
			System.out.println("same type");
			if(type1.equals("int")){
				System.out.println("INT");
				switch (op) {
					case "<" :
						return Integer.parseInt(item1) < Integer.parseInt(item2);
					case ">" :
						return Integer.parseInt(item1) > Integer.parseInt(item2);
					case "<=" :
						return Integer.parseInt(item1) <= Integer.parseInt(item2);
					case ">=" :
						return Integer.parseInt(item1) >= Integer.parseInt(item2);
					case "=" :
						return Integer.parseInt(item1) == Integer.parseInt(item2);
					case "<>" :
						return Integer.parseInt(item1) != Integer.parseInt(item2);
				}
			} else if(type1.equals("float")){
				System.out.println("FLOAT");
				switch (op) {
					case "<" :
						return Float.parseFloat(item1) < Float.parseFloat(item2);
					case ">" :
						return Float.parseFloat(item1) > Float.parseFloat(item2);
					case "<=" :
						return Float.parseFloat(item1) <= Float.parseFloat(item2);
					case ">=" :
						return Float.parseFloat(item1) >= Float.parseFloat(item2);
					case "=" :
						return Float.parseFloat(item1) == Float.parseFloat(item2);
					case "<>" :
						return Float.parseFloat(item1) != Float.parseFloat(item2);
				}
			} else if(type1.equals("date")){
				List<String> date1 = Arrays.asList(item1.split("\\s*-\\s*"));
				List<String> date2 = Arrays.asList(item2.split("\\s*-\\s*"));
				int year1 = Integer.valueOf(date1.get(0));
				int year2 = Integer.valueOf(date2.get(0));
				int month1 = Integer.valueOf(date1.get(1));
				int month2 = Integer.valueOf(date2.get(1));
				int day1 = Integer.valueOf(date1.get(2));
				int day2 = Integer.valueOf(date2.get(2));
				switch(op){
					case "<":
						if ( year1 < year2 ){
							return true;
						}
						else if ( month1 < month2 ){
							return true; 
						}
						else if ( day1 < day2 ){
							return true;
						}
						else 
							return false;
					case ">":
						if ( year1 > year2 ){
							return true;
						}
						else if ( month1 > month2 ){
							return true; 
						}
						else if ( day1 > day2 ){
							return true;
						}
						else 
							return false;
					case "<=":
						if ( year1 <= year2 ){
							return true;
						}
						else if ( month1 <= month2 ){
							return true; 
						}
						else if ( day1 <= day2 ){
							return true;
						}
						else 
							return false;
					case ">=":
						if ( year1 >= year2 ){
							return true;
						}
						else if ( month1 >= month2 ){
							return true; 
						}
						else if ( day1 >= day2 ){
							return true;
						}
						else 
							return false;
					case "=":
						if ( ( year1 == year2 )
							&& ( month1 == month2)
							&& ( day1 == day2)
							)
							return true;
						else 
							return false; 
					case "<>":
						if(( year1 != year2 )
						   ||( month1 != month2 )
						   ||( day1 != day2 )
						  )
							return true;
						else
							return false; 
				}
			} else {
				//CHAR
				System.out.println("CHAR");
				switch(op) {
					case "<":
						boolean result = false; 
						int cmp = item1.compareTo(item2);
						if (cmp < 0)
							result = true;
						return result;
					case ">":
						result = false; 
						cmp = item1.compareTo(item2);
						if (cmp > 0)
							result = true;
						return result;
					case "<=":
						result = false; 
						cmp = item1.compareTo(item2);
						if (cmp <= 0)
							result = true;
						return result;
					case ">=":
						result = false; 
						cmp = item1.compareTo(item2);
						if (cmp >= 0)
							result = true;
						return result;
					case "=" :
						return item1.equals(item2);
					case "<>" :
						return !item1.equals(item2);
					default	:
						return false;
				}
			}
		} else if((type1.equals("float") && type2.equals("int")) || (type2.equals("float") && type1.equals("int"))){
			System.out.println("FLOAT or INT");
			switch (op) {
				case "<" :
					return Float.parseFloat(item1) < Float.parseFloat(item2);
				case ">" :
					return Float.parseFloat(item1) > Float.parseFloat(item2);
				case "<=" :
					return Float.parseFloat(item1) <= Float.parseFloat(item2);
				case ">=" :
					return Float.parseFloat(item1) >= Float.parseFloat(item2);
				case "=" :
					return Float.parseFloat(item1) == Float.parseFloat(item2);
				case "<>" :
					return Float.parseFloat(item1) != Float.parseFloat(item2);
			}
		} else if (type1.length() > 3 && type2.length() > 3 && type1.substring(0, 4).equals("char") && type2.substring(0, 4).equals("char")){
			System.out.println("CHAR");
			switch(op) {
				case "<":
					boolean result = false; 
					int cmp = item1.compareTo(item2);
					if (cmp < 0)
						result = true;
					return result;
				case ">":
					result = false; 
					cmp = item1.compareTo(item2);
					if (cmp > 0)
						result = true;
					return result;
				case "<=":
					result = false; 
					cmp = item1.compareTo(item2);
					if (cmp <= 0)
						result = true;
					return result;
				case ">=":
					result = false; 
					cmp = item1.compareTo(item2);
					if (cmp >= 0)
						result = true;
					return result;
				case "=" :
					return item1.equals(item2);
				case "<>" :
					return !item1.equals(item2);
				default	:
					return false;
			}
		}
		return false;
	}
	
	public String type(String literal){
		String type = "";
		if(dml.validateInt(literal)){
			type = "int";
		} else if (dml.validateFloat(literal)){
			type = "float";
		} else if (dml.validateDate(literal)){
			type = "date";
		} else {
			type = "char("+String.valueOf(literal.length())+")";
		}
		return type;
	}
}
