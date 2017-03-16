// Generated from DBMS.g4 by ANTLR 4.6.

package parser // DBMS

import (
	"fmt"
	"reflect"
	"strconv"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// Suppress unused import errors
var _ = fmt.Printf
var _ = reflect.Copy
var _ = strconv.Itoa

var parserATN = []uint16{
	3, 1072, 54993, 33286, 44333, 17431, 44785, 36224, 43741, 3, 65, 448, 4,
	2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7, 4,
	8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 4, 13, 9,
	13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4, 18, 9, 18,
	4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23, 9, 23, 4,
	24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9, 28, 4, 29,
	9, 29, 4, 30, 9, 30, 4, 31, 9, 31, 4, 32, 9, 32, 4, 33, 9, 33, 4, 34, 9,
	34, 4, 35, 9, 35, 4, 36, 9, 36, 4, 37, 9, 37, 3, 2, 3, 2, 3, 2, 3, 2, 5,
	2, 79, 10, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
	3, 3, 3, 3, 4, 3, 4, 7, 4, 94, 10, 4, 12, 4, 14, 4, 97, 11, 4, 5, 4, 99,
	10, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 5, 5, 107, 10, 5, 3, 6, 3, 6,
	3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 8, 3, 8, 3, 8,
	3, 8, 3, 9, 3, 9, 3, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 11, 3, 11, 3, 11,
	3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 5, 11, 140, 10, 11, 3, 12, 3,
	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 5, 12, 149, 10, 12, 3, 13, 3, 13,
	3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 7, 13, 160, 10, 13, 12,
	13, 14, 13, 163, 11, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 7, 13, 170,
	10, 13, 12, 13, 14, 13, 173, 11, 13, 5, 13, 175, 10, 13, 3, 13, 3, 13,
	3, 14, 3, 14, 3, 14, 7, 14, 182, 10, 14, 12, 14, 14, 14, 185, 11, 14, 3,
	14, 3, 14, 7, 14, 189, 10, 14, 12, 14, 14, 14, 192, 11, 14, 5, 14, 194,
	10, 14, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 7, 15, 203, 10,
	15, 12, 15, 14, 15, 206, 11, 15, 3, 15, 3, 15, 3, 16, 3, 16, 3, 16, 3,
	16, 3, 16, 3, 16, 3, 16, 7, 16, 217, 10, 16, 12, 16, 14, 16, 220, 11, 16,
	3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 7, 16, 229, 10, 16, 12,
	16, 14, 16, 232, 11, 16, 3, 16, 3, 16, 3, 17, 3, 17, 3, 17, 3, 17, 3, 18,
	3, 18, 5, 18, 242, 10, 18, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 7,
	19, 250, 10, 19, 12, 19, 14, 19, 253, 11, 19, 3, 20, 3, 20, 3, 20, 3, 20,
	3, 20, 3, 20, 7, 20, 261, 10, 20, 12, 20, 14, 20, 264, 11, 20, 3, 21, 3,
	21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 7, 21, 273, 10, 21, 12, 21, 14,
	21, 276, 11, 21, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 7, 22,
	285, 10, 22, 12, 22, 14, 22, 288, 11, 22, 3, 23, 3, 23, 5, 23, 292, 10,
	23, 3, 23, 3, 23, 3, 23, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24,
	3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 7, 24, 309, 10, 24, 12, 24, 14, 24,
	312, 11, 24, 5, 24, 314, 10, 24, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3,
	25, 3, 25, 3, 25, 7, 25, 324, 10, 25, 12, 25, 14, 25, 327, 11, 25, 5, 25,
	329, 10, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3,
	25, 5, 25, 340, 10, 25, 3, 26, 3, 26, 3, 26, 3, 26, 3, 27, 3, 27, 3, 27,
	3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3,
	29, 3, 29, 7, 29, 361, 10, 29, 12, 29, 14, 29, 364, 11, 29, 3, 29, 3, 29,
	3, 29, 3, 29, 3, 29, 3, 29, 7, 29, 372, 10, 29, 12, 29, 14, 29, 375, 11,
	29, 3, 29, 3, 29, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30,
	7, 30, 387, 10, 30, 12, 30, 14, 30, 390, 11, 30, 3, 30, 3, 30, 5, 30, 394,
	10, 30, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 5, 31, 401, 10, 31, 3, 32, 3,
	32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32,
	3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 7, 32, 420, 10, 32, 12, 32, 14, 32,
	423, 11, 32, 5, 32, 425, 10, 32, 5, 32, 427, 10, 32, 3, 33, 3, 33, 3, 33,
	3, 33, 7, 33, 433, 10, 33, 12, 33, 14, 33, 436, 11, 33, 5, 33, 438, 10,
	33, 3, 34, 3, 34, 3, 35, 3, 35, 3, 36, 3, 36, 3, 37, 3, 37, 3, 37, 2, 6,
	36, 38, 40, 42, 38, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28,
	30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64,
	66, 68, 70, 72, 2, 6, 4, 2, 7, 7, 9, 12, 3, 2, 13, 14, 4, 2, 3, 3, 15,
	15, 4, 2, 8, 8, 16, 17, 467, 2, 78, 3, 2, 2, 2, 4, 80, 3, 2, 2, 2, 6, 98,
	3, 2, 2, 2, 8, 106, 3, 2, 2, 2, 10, 108, 3, 2, 2, 2, 12, 112, 3, 2, 2,
	2, 14, 119, 3, 2, 2, 2, 16, 123, 3, 2, 2, 2, 18, 126, 3, 2, 2, 2, 20, 139,
	3, 2, 2, 2, 22, 148, 3, 2, 2, 2, 24, 150, 3, 2, 2, 2, 26, 193, 3, 2, 2,
	2, 28, 195, 3, 2, 2, 2, 30, 209, 3, 2, 2, 2, 32, 235, 3, 2, 2, 2, 34, 241,
	3, 2, 2, 2, 36, 243, 3, 2, 2, 2, 38, 254, 3, 2, 2, 2, 40, 265, 3, 2, 2,
	2, 42, 277, 3, 2, 2, 2, 44, 289, 3, 2, 2, 2, 46, 313, 3, 2, 2, 2, 48, 339,
	3, 2, 2, 2, 50, 341, 3, 2, 2, 2, 52, 345, 3, 2, 2, 2, 54, 348, 3, 2, 2,
	2, 56, 353, 3, 2, 2, 2, 58, 378, 3, 2, 2, 2, 60, 395, 3, 2, 2, 2, 62, 402,
	3, 2, 2, 2, 64, 437, 3, 2, 2, 2, 66, 439, 3, 2, 2, 2, 68, 441, 3, 2, 2,
	2, 70, 443, 3, 2, 2, 2, 72, 445, 3, 2, 2, 2, 74, 79, 7, 60, 2, 2, 75, 79,
	7, 61, 2, 2, 76, 79, 7, 62, 2, 2, 77, 79, 5, 4, 3, 2, 78, 74, 3, 2, 2,
	2, 78, 75, 3, 2, 2, 2, 78, 76, 3, 2, 2, 2, 78, 77, 3, 2, 2, 2, 79, 3, 3,
	2, 2, 2, 80, 81, 7, 65, 2, 2, 81, 82, 7, 65, 2, 2, 82, 83, 7, 65, 2, 2,
	83, 84, 7, 65, 2, 2, 84, 85, 7, 3, 2, 2, 85, 86, 7, 65, 2, 2, 86, 87, 7,
	65, 2, 2, 87, 88, 7, 3, 2, 2, 88, 89, 7, 65, 2, 2, 89, 90, 7, 65, 2, 2,
	90, 5, 3, 2, 2, 2, 91, 99, 5, 8, 5, 2, 92, 94, 5, 8, 5, 2, 93, 92, 3, 2,
	2, 2, 94, 97, 3, 2, 2, 2, 95, 93, 3, 2, 2, 2, 95, 96, 3, 2, 2, 2, 96, 99,
	3, 2, 2, 2, 97, 95, 3, 2, 2, 2, 98, 91, 3, 2, 2, 2, 98, 95, 3, 2, 2, 2,
	99, 7, 3, 2, 2, 2, 100, 107, 5, 10, 6, 2, 101, 107, 5, 12, 7, 2, 102, 107,
	5, 14, 8, 2, 103, 107, 5, 16, 9, 2, 104, 107, 5, 18, 10, 2, 105, 107, 5,
	20, 11, 2, 106, 100, 3, 2, 2, 2, 106, 101, 3, 2, 2, 2, 106, 102, 3, 2,
	2, 2, 106, 103, 3, 2, 2, 2, 106, 104, 3, 2, 2, 2, 106, 105, 3, 2, 2, 2,
	107, 9, 3, 2, 2, 2, 108, 109, 7, 18, 2, 2, 109, 110, 7, 19, 2, 2, 110,
	111, 7, 60, 2, 2, 111, 11, 3, 2, 2, 2, 112, 113, 7, 21, 2, 2, 113, 114,
	7, 19, 2, 2, 114, 115, 7, 60, 2, 2, 115, 116, 7, 22, 2, 2, 116, 117, 7,
	24, 2, 2, 117, 118, 7, 60, 2, 2, 118, 13, 3, 2, 2, 2, 119, 120, 7, 23,
	2, 2, 120, 121, 7, 19, 2, 2, 121, 122, 7, 60, 2, 2, 122, 15, 3, 2, 2, 2,
	123, 124, 7, 25, 2, 2, 124, 125, 7, 20, 2, 2, 125, 17, 3, 2, 2, 2, 126,
	127, 7, 26, 2, 2, 127, 128, 7, 19, 2, 2, 128, 129, 7, 60, 2, 2, 129, 19,
	3, 2, 2, 2, 130, 140, 5, 24, 13, 2, 131, 140, 5, 46, 24, 2, 132, 140, 5,
	50, 26, 2, 133, 140, 5, 52, 27, 2, 134, 140, 5, 54, 28, 2, 135, 140, 5,
	56, 29, 2, 136, 140, 5, 58, 30, 2, 137, 140, 5, 60, 31, 2, 138, 140, 5,
	62, 32, 2, 139, 130, 3, 2, 2, 2, 139, 131, 3, 2, 2, 2, 139, 132, 3, 2,
	2, 2, 139, 133, 3, 2, 2, 2, 139, 134, 3, 2, 2, 2, 139, 135, 3, 2, 2, 2,
	139, 136, 3, 2, 2, 2, 139, 137, 3, 2, 2, 2, 139, 138, 3, 2, 2, 2, 140,
	21, 3, 2, 2, 2, 141, 149, 7, 33, 2, 2, 142, 149, 7, 34, 2, 2, 143, 149,
	7, 35, 2, 2, 144, 145, 7, 36, 2, 2, 145, 146, 7, 4, 2, 2, 146, 147, 7,
	61, 2, 2, 147, 149, 7, 5, 2, 2, 148, 141, 3, 2, 2, 2, 148, 142, 3, 2, 2,
	2, 148, 143, 3, 2, 2, 2, 148, 144, 3, 2, 2, 2, 149, 23, 3, 2, 2, 2, 150,
	151, 7, 18, 2, 2, 151, 152, 7, 40, 2, 2, 152, 153, 7, 60, 2, 2, 153, 154,
	7, 4, 2, 2, 154, 155, 7, 60, 2, 2, 155, 161, 5, 22, 12, 2, 156, 157, 7,
	6, 2, 2, 157, 158, 7, 60, 2, 2, 158, 160, 5, 22, 12, 2, 159, 156, 3, 2,
	2, 2, 160, 163, 3, 2, 2, 2, 161, 159, 3, 2, 2, 2, 161, 162, 3, 2, 2, 2,
	162, 174, 3, 2, 2, 2, 163, 161, 3, 2, 2, 2, 164, 165, 7, 27, 2, 2, 165,
	171, 5, 26, 14, 2, 166, 167, 7, 6, 2, 2, 167, 168, 7, 27, 2, 2, 168, 170,
	5, 26, 14, 2, 169, 166, 3, 2, 2, 2, 170, 173, 3, 2, 2, 2, 171, 169, 3,
	2, 2, 2, 171, 172, 3, 2, 2, 2, 172, 175, 3, 2, 2, 2, 173, 171, 3, 2, 2,
	2, 174, 164, 3, 2, 2, 2, 174, 175, 3, 2, 2, 2, 175, 176, 3, 2, 2, 2, 176,
	177, 7, 5, 2, 2, 177, 25, 3, 2, 2, 2, 178, 194, 5, 28, 15, 2, 179, 183,
	5, 30, 16, 2, 180, 182, 5, 30, 16, 2, 181, 180, 3, 2, 2, 2, 182, 185, 3,
	2, 2, 2, 183, 181, 3, 2, 2, 2, 183, 184, 3, 2, 2, 2, 184, 194, 3, 2, 2,
	2, 185, 183, 3, 2, 2, 2, 186, 190, 5, 32, 17, 2, 187, 189, 5, 32, 17, 2,
	188, 187, 3, 2, 2, 2, 189, 192, 3, 2, 2, 2, 190, 188, 3, 2, 2, 2, 190,
	191, 3, 2, 2, 2, 191, 194, 3, 2, 2, 2, 192, 190, 3, 2, 2, 2, 193, 178,
	3, 2, 2, 2, 193, 179, 3, 2, 2, 2, 193, 186, 3, 2, 2, 2, 194, 27, 3, 2,
	2, 2, 195, 196, 7, 60, 2, 2, 196, 197, 7, 28, 2, 2, 197, 198, 7, 30, 2,
	2, 198, 199, 7, 4, 2, 2, 199, 204, 7, 60, 2, 2, 200, 201, 7, 6, 2, 2, 201,
	203, 7, 60, 2, 2, 202, 200, 3, 2, 2, 2, 203, 206, 3, 2, 2, 2, 204, 202,
	3, 2, 2, 2, 204, 205, 3, 2, 2, 2, 205, 207, 3, 2, 2, 2, 206, 204, 3, 2,
	2, 2, 207, 208, 7, 5, 2, 2, 208, 29, 3, 2, 2, 2, 209, 210, 7, 60, 2, 2,
	210, 211, 7, 29, 2, 2, 211, 212, 7, 30, 2, 2, 212, 213, 7, 4, 2, 2, 213,
	218, 7, 60, 2, 2, 214, 215, 7, 6, 2, 2, 215, 217, 7, 60, 2, 2, 216, 214,
	3, 2, 2, 2, 217, 220, 3, 2, 2, 2, 218, 216, 3, 2, 2, 2, 218, 219, 3, 2,
	2, 2, 219, 221, 3, 2, 2, 2, 220, 218, 3, 2, 2, 2, 221, 222, 7, 5, 2, 2,
	222, 223, 7, 31, 2, 2, 223, 224, 7, 60, 2, 2, 224, 225, 7, 4, 2, 2, 225,
	230, 7, 60, 2, 2, 226, 227, 7, 6, 2, 2, 227, 229, 7, 60, 2, 2, 228, 226,
	3, 2, 2, 2, 229, 232, 3, 2, 2, 2, 230, 228, 3, 2, 2, 2, 230, 231, 3, 2,
	2, 2, 231, 233, 3, 2, 2, 2, 232, 230, 3, 2, 2, 2, 233, 234, 7, 5, 2, 2,
	234, 31, 3, 2, 2, 2, 235, 236, 7, 60, 2, 2, 236, 237, 7, 32, 2, 2, 237,
	238, 5, 34, 18, 2, 238, 33, 3, 2, 2, 2, 239, 242, 5, 36, 19, 2, 240, 242,
	3, 2, 2, 2, 241, 239, 3, 2, 2, 2, 241, 240, 3, 2, 2, 2, 242, 35, 3, 2,
	2, 2, 243, 244, 8, 19, 1, 2, 244, 245, 5, 38, 20, 2, 245, 251, 3, 2, 2,
	2, 246, 247, 12, 3, 2, 2, 247, 248, 7, 38, 2, 2, 248, 250, 5, 38, 20, 2,
	249, 246, 3, 2, 2, 2, 250, 253, 3, 2, 2, 2, 251, 249, 3, 2, 2, 2, 251,
	252, 3, 2, 2, 2, 252, 37, 3, 2, 2, 2, 253, 251, 3, 2, 2, 2, 254, 255, 8,
	20, 1, 2, 255, 256, 5, 40, 21, 2, 256, 262, 3, 2, 2, 2, 257, 258, 12, 3,
	2, 2, 258, 259, 7, 37, 2, 2, 259, 261, 5, 40, 21, 2, 260, 257, 3, 2, 2,
	2, 261, 264, 3, 2, 2, 2, 262, 260, 3, 2, 2, 2, 262, 263, 3, 2, 2, 2, 263,
	39, 3, 2, 2, 2, 264, 262, 3, 2, 2, 2, 265, 266, 8, 21, 1, 2, 266, 267,
	5, 42, 22, 2, 267, 274, 3, 2, 2, 2, 268, 269, 12, 3, 2, 2, 269, 270, 5,
	68, 35, 2, 270, 271, 5, 42, 22, 2, 271, 273, 3, 2, 2, 2, 272, 268, 3, 2,
	2, 2, 273, 276, 3, 2, 2, 2, 274, 272, 3, 2, 2, 2, 274, 275, 3, 2, 2, 2,
	275, 41, 3, 2, 2, 2, 276, 274, 3, 2, 2, 2, 277, 278, 8, 22, 1, 2, 278,
	279, 5, 44, 23, 2, 279, 286, 3, 2, 2, 2, 280, 281, 12, 3, 2, 2, 281, 282,
	5, 66, 34, 2, 282, 283, 5, 44, 23, 2, 283, 285, 3, 2, 2, 2, 284, 280, 3,
	2, 2, 2, 285, 288, 3, 2, 2, 2, 286, 284, 3, 2, 2, 2, 286, 287, 3, 2, 2,
	2, 287, 43, 3, 2, 2, 2, 288, 286, 3, 2, 2, 2, 289, 291, 7, 4, 2, 2, 290,
	292, 7, 39, 2, 2, 291, 290, 3, 2, 2, 2, 291, 292, 3, 2, 2, 2, 292, 293,
	3, 2, 2, 2, 293, 294, 7, 60, 2, 2, 294, 295, 7, 5, 2, 2, 295, 45, 3, 2,
	2, 2, 296, 297, 7, 21, 2, 2, 297, 298, 7, 40, 2, 2, 298, 299, 7, 60, 2,
	2, 299, 300, 7, 22, 2, 2, 300, 301, 7, 24, 2, 2, 301, 314, 7, 60, 2, 2,
	302, 303, 7, 21, 2, 2, 303, 304, 7, 40, 2, 2, 304, 305, 7, 60, 2, 2, 305,
	310, 5, 48, 25, 2, 306, 307, 7, 6, 2, 2, 307, 309, 5, 48, 25, 2, 308, 306,
	3, 2, 2, 2, 309, 312, 3, 2, 2, 2, 310, 308, 3, 2, 2, 2, 310, 311, 3, 2,
	2, 2, 311, 314, 3, 2, 2, 2, 312, 310, 3, 2, 2, 2, 313, 296, 3, 2, 2, 2,
	313, 302, 3, 2, 2, 2, 314, 47, 3, 2, 2, 2, 315, 316, 7, 42, 2, 2, 316,
	317, 7, 43, 2, 2, 317, 318, 7, 60, 2, 2, 318, 328, 5, 22, 12, 2, 319, 320,
	7, 27, 2, 2, 320, 325, 5, 26, 14, 2, 321, 322, 7, 6, 2, 2, 322, 324, 5,
	26, 14, 2, 323, 321, 3, 2, 2, 2, 324, 327, 3, 2, 2, 2, 325, 323, 3, 2,
	2, 2, 325, 326, 3, 2, 2, 2, 326, 329, 3, 2, 2, 2, 327, 325, 3, 2, 2, 2,
	328, 319, 3, 2, 2, 2, 328, 329, 3, 2, 2, 2, 329, 340, 3, 2, 2, 2, 330,
	331, 7, 42, 2, 2, 331, 332, 7, 27, 2, 2, 332, 340, 5, 26, 14, 2, 333, 334,
	7, 23, 2, 2, 334, 335, 7, 43, 2, 2, 335, 340, 7, 60, 2, 2, 336, 337, 7,
	23, 2, 2, 337, 338, 7, 27, 2, 2, 338, 340, 7, 60, 2, 2, 339, 315, 3, 2,
	2, 2, 339, 330, 3, 2, 2, 2, 339, 333, 3, 2, 2, 2, 339, 336, 3, 2, 2, 2,
	340, 49, 3, 2, 2, 2, 341, 342, 7, 23, 2, 2, 342, 343, 7, 40, 2, 2, 343,
	344, 7, 60, 2, 2, 344, 51, 3, 2, 2, 2, 345, 346, 7, 25, 2, 2, 346, 347,
	7, 41, 2, 2, 347, 53, 3, 2, 2, 2, 348, 349, 7, 25, 2, 2, 349, 350, 7, 44,
	2, 2, 350, 351, 7, 46, 2, 2, 351, 352, 7, 60, 2, 2, 352, 55, 3, 2, 2, 2,
	353, 354, 7, 47, 2, 2, 354, 355, 7, 50, 2, 2, 355, 356, 7, 60, 2, 2, 356,
	357, 7, 4, 2, 2, 357, 362, 7, 60, 2, 2, 358, 359, 7, 6, 2, 2, 359, 361,
	7, 60, 2, 2, 360, 358, 3, 2, 2, 2, 361, 364, 3, 2, 2, 2, 362, 360, 3, 2,
	2, 2, 362, 363, 3, 2, 2, 2, 363, 365, 3, 2, 2, 2, 364, 362, 3, 2, 2, 2,
	365, 366, 7, 5, 2, 2, 366, 367, 7, 49, 2, 2, 367, 368, 7, 4, 2, 2, 368,
	373, 5, 2, 2, 2, 369, 370, 7, 6, 2, 2, 370, 372, 5, 2, 2, 2, 371, 369,
	3, 2, 2, 2, 372, 375, 3, 2, 2, 2, 373, 371, 3, 2, 2, 2, 373, 374, 3, 2,
	2, 2, 374, 376, 3, 2, 2, 2, 375, 373, 3, 2, 2, 2, 376, 377, 7, 5, 2, 2,
	377, 57, 3, 2, 2, 2, 378, 379, 7, 51, 2, 2, 379, 380, 7, 60, 2, 2, 380,
	381, 7, 52, 2, 2, 381, 382, 7, 60, 2, 2, 382, 383, 7, 7, 2, 2, 383, 388,
	5, 22, 12, 2, 384, 385, 7, 6, 2, 2, 385, 387, 5, 22, 12, 2, 386, 384, 3,
	2, 2, 2, 387, 390, 3, 2, 2, 2, 388, 386, 3, 2, 2, 2, 388, 389, 3, 2, 2,
	2, 389, 393, 3, 2, 2, 2, 390, 388, 3, 2, 2, 2, 391, 392, 7, 53, 2, 2, 392,
	394, 5, 34, 18, 2, 393, 391, 3, 2, 2, 2, 393, 394, 3, 2, 2, 2, 394, 59,
	3, 2, 2, 2, 395, 396, 7, 54, 2, 2, 396, 397, 7, 46, 2, 2, 397, 400, 7,
	60, 2, 2, 398, 399, 7, 53, 2, 2, 399, 401, 5, 34, 18, 2, 400, 398, 3, 2,
	2, 2, 400, 401, 3, 2, 2, 2, 401, 61, 3, 2, 2, 2, 402, 403, 7, 48, 2, 2,
	403, 404, 5, 64, 33, 2, 404, 405, 7, 46, 2, 2, 405, 426, 7, 60, 2, 2, 406,
	407, 7, 53, 2, 2, 407, 424, 5, 34, 18, 2, 408, 409, 7, 55, 2, 2, 409, 410,
	7, 56, 2, 2, 410, 411, 5, 34, 18, 2, 411, 412, 7, 57, 2, 2, 412, 425, 3,
	2, 2, 2, 413, 421, 7, 58, 2, 2, 414, 415, 7, 6, 2, 2, 415, 416, 5, 34,
	18, 2, 416, 417, 7, 57, 2, 2, 417, 420, 3, 2, 2, 2, 418, 420, 7, 58, 2,
	2, 419, 414, 3, 2, 2, 2, 419, 418, 3, 2, 2, 2, 420, 423, 3, 2, 2, 2, 421,
	419, 3, 2, 2, 2, 421, 422, 3, 2, 2, 2, 422, 425, 3, 2, 2, 2, 423, 421,
	3, 2, 2, 2, 424, 408, 3, 2, 2, 2, 424, 413, 3, 2, 2, 2, 424, 425, 3, 2,
	2, 2, 425, 427, 3, 2, 2, 2, 426, 406, 3, 2, 2, 2, 426, 427, 3, 2, 2, 2,
	427, 63, 3, 2, 2, 2, 428, 438, 7, 8, 2, 2, 429, 434, 7, 60, 2, 2, 430,
	431, 7, 6, 2, 2, 431, 433, 7, 60, 2, 2, 432, 430, 3, 2, 2, 2, 433, 436,
	3, 2, 2, 2, 434, 432, 3, 2, 2, 2, 434, 435, 3, 2, 2, 2, 435, 438, 3, 2,
	2, 2, 436, 434, 3, 2, 2, 2, 437, 428, 3, 2, 2, 2, 437, 429, 3, 2, 2, 2,
	438, 65, 3, 2, 2, 2, 439, 440, 9, 2, 2, 2, 440, 67, 3, 2, 2, 2, 441, 442,
	9, 3, 2, 2, 442, 69, 3, 2, 2, 2, 443, 444, 9, 4, 2, 2, 444, 71, 3, 2, 2,
	2, 445, 446, 9, 5, 2, 2, 446, 73, 3, 2, 2, 2, 39, 78, 95, 98, 106, 139,
	148, 161, 171, 174, 183, 190, 193, 204, 218, 230, 241, 251, 262, 274, 286,
	291, 310, 313, 325, 328, 339, 362, 373, 388, 393, 400, 419, 421, 424, 426,
	434, 437,
}

var deserializer = antlr.NewATNDeserializer(nil)

var deserializedATN = deserializer.DeserializeFromUInt16(parserATN)

var literalNames = []string{
	"", "'-'", "'('", "')'", "','", "'='", "'*'", "'<'", "'>'", "'<='", "'>='",
	"'=='", "'!='", "'+'", "'/'", "'%'",
}

var symbolicNames = []string{
	"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "CREATE",
	"DATABASE", "DATABASES", "ALTER", "RENAME", "DROP", "TO", "SHOW", "USE",
	"CONSTRAINT", "PRIMARY", "FOREIGN", "KEY", "REFERENCES", "CHECK", "INT",
	"FLOAT", "DATE", "CHAR", "AND", "OR", "NOT", "TABLE", "TABLES", "ADD",
	"COLUMN", "COLUMNS", "SHOWX", "FROM", "INSERT", "SELECT", "VALUES", "INTO",
	"UPDATE", "SET", "WHERE", "DELETE", "ORDER", "BY", "ASC", "DESC", "NULL",
	"IDX", "NUMX", "CHARX", "SPACEX", "COMMENTX", "DIGITX",
}

var ruleNames = []string{
	"literal", "fecha", "program", "database", "createDatabase", "alterDatabase",
	"dropDatabase", "showDatabase", "useDatabase", "opTable", "tipo", "createTable",
	"constraint", "primaryKey", "foreignKey", "check", "exp", "expression",
	"andExpr", "eqExpr", "relationExpr", "unaryExpr", "alterTable", "action",
	"dropTable", "showTables", "showColumns", "insertInto", "updateSet", "deleteFrom",
	"selectFrom", "sep", "rel_op", "eq_op", "add_op", "mult_op",
}

type DBMSParser struct {
	*antlr.BaseParser
}

func NewDBMSParser(input antlr.TokenStream) *DBMSParser {
	var decisionToDFA = make([]*antlr.DFA, len(deserializedATN.DecisionToState))
	var sharedContextCache = antlr.NewPredictionContextCache()

	for index, ds := range deserializedATN.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(ds, index)
	}

	this := new(DBMSParser)

	this.BaseParser = antlr.NewBaseParser(input)

	this.Interpreter = antlr.NewParserATNSimulator(this, deserializedATN, decisionToDFA, sharedContextCache)
	this.RuleNames = ruleNames
	this.LiteralNames = literalNames
	this.SymbolicNames = symbolicNames
	this.GrammarFileName = "DBMS.g4"

	return this
}

// DBMSParser tokens.
const (
	DBMSParserEOF        = antlr.TokenEOF
	DBMSParserT__0       = 1
	DBMSParserT__1       = 2
	DBMSParserT__2       = 3
	DBMSParserT__3       = 4
	DBMSParserT__4       = 5
	DBMSParserT__5       = 6
	DBMSParserT__6       = 7
	DBMSParserT__7       = 8
	DBMSParserT__8       = 9
	DBMSParserT__9       = 10
	DBMSParserT__10      = 11
	DBMSParserT__11      = 12
	DBMSParserT__12      = 13
	DBMSParserT__13      = 14
	DBMSParserT__14      = 15
	DBMSParserCREATE     = 16
	DBMSParserDATABASE   = 17
	DBMSParserDATABASES  = 18
	DBMSParserALTER      = 19
	DBMSParserRENAME     = 20
	DBMSParserDROP       = 21
	DBMSParserTO         = 22
	DBMSParserSHOW       = 23
	DBMSParserUSE        = 24
	DBMSParserCONSTRAINT = 25
	DBMSParserPRIMARY    = 26
	DBMSParserFOREIGN    = 27
	DBMSParserKEY        = 28
	DBMSParserREFERENCES = 29
	DBMSParserCHECK      = 30
	DBMSParserINT        = 31
	DBMSParserFLOAT      = 32
	DBMSParserDATE       = 33
	DBMSParserCHAR       = 34
	DBMSParserAND        = 35
	DBMSParserOR         = 36
	DBMSParserNOT        = 37
	DBMSParserTABLE      = 38
	DBMSParserTABLES     = 39
	DBMSParserADD        = 40
	DBMSParserCOLUMN     = 41
	DBMSParserCOLUMNS    = 42
	DBMSParserSHOWX      = 43
	DBMSParserFROM       = 44
	DBMSParserINSERT     = 45
	DBMSParserSELECT     = 46
	DBMSParserVALUES     = 47
	DBMSParserINTO       = 48
	DBMSParserUPDATE     = 49
	DBMSParserSET        = 50
	DBMSParserWHERE      = 51
	DBMSParserDELETE     = 52
	DBMSParserORDER      = 53
	DBMSParserBY         = 54
	DBMSParserASC        = 55
	DBMSParserDESC       = 56
	DBMSParserNULL       = 57
	DBMSParserIDX        = 58
	DBMSParserNUMX       = 59
	DBMSParserCHARX      = 60
	DBMSParserSPACEX     = 61
	DBMSParserCOMMENTX   = 62
	DBMSParserDIGITX     = 63
)

// DBMSParser rules.
const (
	DBMSParserRULE_literal        = 0
	DBMSParserRULE_fecha          = 1
	DBMSParserRULE_program        = 2
	DBMSParserRULE_database       = 3
	DBMSParserRULE_createDatabase = 4
	DBMSParserRULE_alterDatabase  = 5
	DBMSParserRULE_dropDatabase   = 6
	DBMSParserRULE_showDatabase   = 7
	DBMSParserRULE_useDatabase    = 8
	DBMSParserRULE_opTable        = 9
	DBMSParserRULE_tipo           = 10
	DBMSParserRULE_createTable    = 11
	DBMSParserRULE_constraint     = 12
	DBMSParserRULE_primaryKey     = 13
	DBMSParserRULE_foreignKey     = 14
	DBMSParserRULE_check          = 15
	DBMSParserRULE_exp            = 16
	DBMSParserRULE_expression     = 17
	DBMSParserRULE_andExpr        = 18
	DBMSParserRULE_eqExpr         = 19
	DBMSParserRULE_relationExpr   = 20
	DBMSParserRULE_unaryExpr      = 21
	DBMSParserRULE_alterTable     = 22
	DBMSParserRULE_action         = 23
	DBMSParserRULE_dropTable      = 24
	DBMSParserRULE_showTables     = 25
	DBMSParserRULE_showColumns    = 26
	DBMSParserRULE_insertInto     = 27
	DBMSParserRULE_updateSet      = 28
	DBMSParserRULE_deleteFrom     = 29
	DBMSParserRULE_selectFrom     = 30
	DBMSParserRULE_sep            = 31
	DBMSParserRULE_rel_op         = 32
	DBMSParserRULE_eq_op          = 33
	DBMSParserRULE_add_op         = 34
	DBMSParserRULE_mult_op        = 35
)

// ILiteralContext is an interface to support dynamic dispatch.
type ILiteralContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsLiteralContext differentiates from other interfaces.
	IsLiteralContext()
}

type LiteralContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyLiteralContext() *LiteralContext {
	var p = new(LiteralContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_literal
	return p
}

func (*LiteralContext) IsLiteralContext() {}

func NewLiteralContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *LiteralContext {
	var p = new(LiteralContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_literal

	return p
}

func (s *LiteralContext) GetParser() antlr.Parser { return s.parser }

func (s *LiteralContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *LiteralContext) NUMX() antlr.TerminalNode {
	return s.GetToken(DBMSParserNUMX, 0)
}

func (s *LiteralContext) CHARX() antlr.TerminalNode {
	return s.GetToken(DBMSParserCHARX, 0)
}

func (s *LiteralContext) Fecha() IFechaContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFechaContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFechaContext)
}

func (s *LiteralContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LiteralContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *LiteralContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterLiteral(s)
	}
}

func (s *LiteralContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitLiteral(s)
	}
}

func (s *LiteralContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitLiteral(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Literal() (localctx ILiteralContext) {
	localctx = NewLiteralContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, DBMSParserRULE_literal)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(76)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBMSParserIDX:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(72)
			p.Match(DBMSParserIDX)
		}

	case DBMSParserNUMX:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(73)
			p.Match(DBMSParserNUMX)
		}

	case DBMSParserCHARX:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(74)
			p.Match(DBMSParserCHARX)
		}

	case DBMSParserDIGITX:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(75)
			p.Fecha()
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IFechaContext is an interface to support dynamic dispatch.
type IFechaContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFechaContext differentiates from other interfaces.
	IsFechaContext()
}

type FechaContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFechaContext() *FechaContext {
	var p = new(FechaContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_fecha
	return p
}

func (*FechaContext) IsFechaContext() {}

func NewFechaContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FechaContext {
	var p = new(FechaContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_fecha

	return p
}

func (s *FechaContext) GetParser() antlr.Parser { return s.parser }

func (s *FechaContext) AllDIGITX() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserDIGITX)
}

func (s *FechaContext) DIGITX(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserDIGITX, i)
}

func (s *FechaContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FechaContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FechaContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterFecha(s)
	}
}

func (s *FechaContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitFecha(s)
	}
}

func (s *FechaContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitFecha(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Fecha() (localctx IFechaContext) {
	localctx = NewFechaContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, DBMSParserRULE_fecha)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(78)
		p.Match(DBMSParserDIGITX)
	}
	{
		p.SetState(79)
		p.Match(DBMSParserDIGITX)
	}
	{
		p.SetState(80)
		p.Match(DBMSParserDIGITX)
	}
	{
		p.SetState(81)
		p.Match(DBMSParserDIGITX)
	}
	{
		p.SetState(82)
		p.Match(DBMSParserT__0)
	}
	{
		p.SetState(83)
		p.Match(DBMSParserDIGITX)
	}
	{
		p.SetState(84)
		p.Match(DBMSParserDIGITX)
	}
	{
		p.SetState(85)
		p.Match(DBMSParserT__0)
	}
	{
		p.SetState(86)
		p.Match(DBMSParserDIGITX)
	}
	{
		p.SetState(87)
		p.Match(DBMSParserDIGITX)
	}

	return localctx
}

// IProgramContext is an interface to support dynamic dispatch.
type IProgramContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsProgramContext differentiates from other interfaces.
	IsProgramContext()
}

type ProgramContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyProgramContext() *ProgramContext {
	var p = new(ProgramContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_program
	return p
}

func (*ProgramContext) IsProgramContext() {}

func NewProgramContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ProgramContext {
	var p = new(ProgramContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_program

	return p
}

func (s *ProgramContext) GetParser() antlr.Parser { return s.parser }

func (s *ProgramContext) AllDatabase() []IDatabaseContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IDatabaseContext)(nil)).Elem())
	var tst = make([]IDatabaseContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IDatabaseContext)
		}
	}

	return tst
}

func (s *ProgramContext) Database(i int) IDatabaseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDatabaseContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IDatabaseContext)
}

func (s *ProgramContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ProgramContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ProgramContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterProgram(s)
	}
}

func (s *ProgramContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitProgram(s)
	}
}

func (s *ProgramContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitProgram(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Program() (localctx IProgramContext) {
	localctx = NewProgramContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, DBMSParserRULE_program)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(96)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 2, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(89)
			p.Database()
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		p.SetState(93)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<DBMSParserCREATE)|(1<<DBMSParserALTER)|(1<<DBMSParserDROP)|(1<<DBMSParserSHOW)|(1<<DBMSParserUSE))) != 0) || (((_la-45)&-(0x1f+1)) == 0 && ((1<<uint((_la-45)))&((1<<(DBMSParserINSERT-45))|(1<<(DBMSParserSELECT-45))|(1<<(DBMSParserUPDATE-45))|(1<<(DBMSParserDELETE-45)))) != 0) {
			{
				p.SetState(90)
				p.Database()
			}

			p.SetState(95)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}

	return localctx
}

// IDatabaseContext is an interface to support dynamic dispatch.
type IDatabaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsDatabaseContext differentiates from other interfaces.
	IsDatabaseContext()
}

type DatabaseContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyDatabaseContext() *DatabaseContext {
	var p = new(DatabaseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_database
	return p
}

func (*DatabaseContext) IsDatabaseContext() {}

func NewDatabaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DatabaseContext {
	var p = new(DatabaseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_database

	return p
}

func (s *DatabaseContext) GetParser() antlr.Parser { return s.parser }

func (s *DatabaseContext) CreateDatabase() ICreateDatabaseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ICreateDatabaseContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ICreateDatabaseContext)
}

func (s *DatabaseContext) AlterDatabase() IAlterDatabaseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAlterDatabaseContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAlterDatabaseContext)
}

func (s *DatabaseContext) DropDatabase() IDropDatabaseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDropDatabaseContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDropDatabaseContext)
}

func (s *DatabaseContext) ShowDatabase() IShowDatabaseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IShowDatabaseContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IShowDatabaseContext)
}

func (s *DatabaseContext) UseDatabase() IUseDatabaseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IUseDatabaseContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IUseDatabaseContext)
}

func (s *DatabaseContext) OpTable() IOpTableContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IOpTableContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IOpTableContext)
}

func (s *DatabaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DatabaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DatabaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterDatabase(s)
	}
}

func (s *DatabaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitDatabase(s)
	}
}

func (s *DatabaseContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitDatabase(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Database() (localctx IDatabaseContext) {
	localctx = NewDatabaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, DBMSParserRULE_database)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(104)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 3, p.GetParserRuleContext()) {
	case 1:
		{
			p.SetState(98)
			p.CreateDatabase()
		}

	case 2:
		{
			p.SetState(99)
			p.AlterDatabase()
		}

	case 3:
		{
			p.SetState(100)
			p.DropDatabase()
		}

	case 4:
		{
			p.SetState(101)
			p.ShowDatabase()
		}

	case 5:
		{
			p.SetState(102)
			p.UseDatabase()
		}

	case 6:
		{
			p.SetState(103)
			p.OpTable()
		}

	}

	return localctx
}

// ICreateDatabaseContext is an interface to support dynamic dispatch.
type ICreateDatabaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsCreateDatabaseContext differentiates from other interfaces.
	IsCreateDatabaseContext()
}

type CreateDatabaseContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyCreateDatabaseContext() *CreateDatabaseContext {
	var p = new(CreateDatabaseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_createDatabase
	return p
}

func (*CreateDatabaseContext) IsCreateDatabaseContext() {}

func NewCreateDatabaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *CreateDatabaseContext {
	var p = new(CreateDatabaseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_createDatabase

	return p
}

func (s *CreateDatabaseContext) GetParser() antlr.Parser { return s.parser }

func (s *CreateDatabaseContext) CREATE() antlr.TerminalNode {
	return s.GetToken(DBMSParserCREATE, 0)
}

func (s *CreateDatabaseContext) DATABASE() antlr.TerminalNode {
	return s.GetToken(DBMSParserDATABASE, 0)
}

func (s *CreateDatabaseContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *CreateDatabaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *CreateDatabaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *CreateDatabaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterCreateDatabase(s)
	}
}

func (s *CreateDatabaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitCreateDatabase(s)
	}
}

func (s *CreateDatabaseContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitCreateDatabase(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) CreateDatabase() (localctx ICreateDatabaseContext) {
	localctx = NewCreateDatabaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, DBMSParserRULE_createDatabase)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(106)
		p.Match(DBMSParserCREATE)
	}
	{
		p.SetState(107)
		p.Match(DBMSParserDATABASE)
	}
	{
		p.SetState(108)
		p.Match(DBMSParserIDX)
	}

	return localctx
}

// IAlterDatabaseContext is an interface to support dynamic dispatch.
type IAlterDatabaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsAlterDatabaseContext differentiates from other interfaces.
	IsAlterDatabaseContext()
}

type AlterDatabaseContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyAlterDatabaseContext() *AlterDatabaseContext {
	var p = new(AlterDatabaseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_alterDatabase
	return p
}

func (*AlterDatabaseContext) IsAlterDatabaseContext() {}

func NewAlterDatabaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AlterDatabaseContext {
	var p = new(AlterDatabaseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_alterDatabase

	return p
}

func (s *AlterDatabaseContext) GetParser() antlr.Parser { return s.parser }

func (s *AlterDatabaseContext) ALTER() antlr.TerminalNode {
	return s.GetToken(DBMSParserALTER, 0)
}

func (s *AlterDatabaseContext) DATABASE() antlr.TerminalNode {
	return s.GetToken(DBMSParserDATABASE, 0)
}

func (s *AlterDatabaseContext) AllIDX() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserIDX)
}

func (s *AlterDatabaseContext) IDX(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, i)
}

func (s *AlterDatabaseContext) RENAME() antlr.TerminalNode {
	return s.GetToken(DBMSParserRENAME, 0)
}

func (s *AlterDatabaseContext) TO() antlr.TerminalNode {
	return s.GetToken(DBMSParserTO, 0)
}

func (s *AlterDatabaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AlterDatabaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AlterDatabaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterAlterDatabase(s)
	}
}

func (s *AlterDatabaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitAlterDatabase(s)
	}
}

func (s *AlterDatabaseContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitAlterDatabase(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) AlterDatabase() (localctx IAlterDatabaseContext) {
	localctx = NewAlterDatabaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 10, DBMSParserRULE_alterDatabase)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(110)
		p.Match(DBMSParserALTER)
	}
	{
		p.SetState(111)
		p.Match(DBMSParserDATABASE)
	}
	{
		p.SetState(112)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(113)
		p.Match(DBMSParserRENAME)
	}
	{
		p.SetState(114)
		p.Match(DBMSParserTO)
	}
	{
		p.SetState(115)
		p.Match(DBMSParserIDX)
	}

	return localctx
}

// IDropDatabaseContext is an interface to support dynamic dispatch.
type IDropDatabaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsDropDatabaseContext differentiates from other interfaces.
	IsDropDatabaseContext()
}

type DropDatabaseContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyDropDatabaseContext() *DropDatabaseContext {
	var p = new(DropDatabaseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_dropDatabase
	return p
}

func (*DropDatabaseContext) IsDropDatabaseContext() {}

func NewDropDatabaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DropDatabaseContext {
	var p = new(DropDatabaseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_dropDatabase

	return p
}

func (s *DropDatabaseContext) GetParser() antlr.Parser { return s.parser }

func (s *DropDatabaseContext) DROP() antlr.TerminalNode {
	return s.GetToken(DBMSParserDROP, 0)
}

func (s *DropDatabaseContext) DATABASE() antlr.TerminalNode {
	return s.GetToken(DBMSParserDATABASE, 0)
}

func (s *DropDatabaseContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *DropDatabaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DropDatabaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DropDatabaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterDropDatabase(s)
	}
}

func (s *DropDatabaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitDropDatabase(s)
	}
}

func (s *DropDatabaseContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitDropDatabase(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) DropDatabase() (localctx IDropDatabaseContext) {
	localctx = NewDropDatabaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, DBMSParserRULE_dropDatabase)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(117)
		p.Match(DBMSParserDROP)
	}
	{
		p.SetState(118)
		p.Match(DBMSParserDATABASE)
	}
	{
		p.SetState(119)
		p.Match(DBMSParserIDX)
	}

	return localctx
}

// IShowDatabaseContext is an interface to support dynamic dispatch.
type IShowDatabaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsShowDatabaseContext differentiates from other interfaces.
	IsShowDatabaseContext()
}

type ShowDatabaseContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyShowDatabaseContext() *ShowDatabaseContext {
	var p = new(ShowDatabaseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_showDatabase
	return p
}

func (*ShowDatabaseContext) IsShowDatabaseContext() {}

func NewShowDatabaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ShowDatabaseContext {
	var p = new(ShowDatabaseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_showDatabase

	return p
}

func (s *ShowDatabaseContext) GetParser() antlr.Parser { return s.parser }

func (s *ShowDatabaseContext) SHOW() antlr.TerminalNode {
	return s.GetToken(DBMSParserSHOW, 0)
}

func (s *ShowDatabaseContext) DATABASES() antlr.TerminalNode {
	return s.GetToken(DBMSParserDATABASES, 0)
}

func (s *ShowDatabaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ShowDatabaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ShowDatabaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterShowDatabase(s)
	}
}

func (s *ShowDatabaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitShowDatabase(s)
	}
}

func (s *ShowDatabaseContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitShowDatabase(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) ShowDatabase() (localctx IShowDatabaseContext) {
	localctx = NewShowDatabaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 14, DBMSParserRULE_showDatabase)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(121)
		p.Match(DBMSParserSHOW)
	}
	{
		p.SetState(122)
		p.Match(DBMSParserDATABASES)
	}

	return localctx
}

// IUseDatabaseContext is an interface to support dynamic dispatch.
type IUseDatabaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsUseDatabaseContext differentiates from other interfaces.
	IsUseDatabaseContext()
}

type UseDatabaseContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyUseDatabaseContext() *UseDatabaseContext {
	var p = new(UseDatabaseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_useDatabase
	return p
}

func (*UseDatabaseContext) IsUseDatabaseContext() {}

func NewUseDatabaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *UseDatabaseContext {
	var p = new(UseDatabaseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_useDatabase

	return p
}

func (s *UseDatabaseContext) GetParser() antlr.Parser { return s.parser }

func (s *UseDatabaseContext) USE() antlr.TerminalNode {
	return s.GetToken(DBMSParserUSE, 0)
}

func (s *UseDatabaseContext) DATABASE() antlr.TerminalNode {
	return s.GetToken(DBMSParserDATABASE, 0)
}

func (s *UseDatabaseContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *UseDatabaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *UseDatabaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *UseDatabaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterUseDatabase(s)
	}
}

func (s *UseDatabaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitUseDatabase(s)
	}
}

func (s *UseDatabaseContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitUseDatabase(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) UseDatabase() (localctx IUseDatabaseContext) {
	localctx = NewUseDatabaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, DBMSParserRULE_useDatabase)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(124)
		p.Match(DBMSParserUSE)
	}
	{
		p.SetState(125)
		p.Match(DBMSParserDATABASE)
	}
	{
		p.SetState(126)
		p.Match(DBMSParserIDX)
	}

	return localctx
}

// IOpTableContext is an interface to support dynamic dispatch.
type IOpTableContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsOpTableContext differentiates from other interfaces.
	IsOpTableContext()
}

type OpTableContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyOpTableContext() *OpTableContext {
	var p = new(OpTableContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_opTable
	return p
}

func (*OpTableContext) IsOpTableContext() {}

func NewOpTableContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *OpTableContext {
	var p = new(OpTableContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_opTable

	return p
}

func (s *OpTableContext) GetParser() antlr.Parser { return s.parser }

func (s *OpTableContext) CreateTable() ICreateTableContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ICreateTableContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ICreateTableContext)
}

func (s *OpTableContext) AlterTable() IAlterTableContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAlterTableContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAlterTableContext)
}

func (s *OpTableContext) DropTable() IDropTableContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDropTableContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDropTableContext)
}

func (s *OpTableContext) ShowTables() IShowTablesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IShowTablesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IShowTablesContext)
}

func (s *OpTableContext) ShowColumns() IShowColumnsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IShowColumnsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IShowColumnsContext)
}

func (s *OpTableContext) InsertInto() IInsertIntoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInsertIntoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInsertIntoContext)
}

func (s *OpTableContext) UpdateSet() IUpdateSetContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IUpdateSetContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IUpdateSetContext)
}

func (s *OpTableContext) DeleteFrom() IDeleteFromContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDeleteFromContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDeleteFromContext)
}

func (s *OpTableContext) SelectFrom() ISelectFromContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ISelectFromContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ISelectFromContext)
}

func (s *OpTableContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OpTableContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *OpTableContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterOpTable(s)
	}
}

func (s *OpTableContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitOpTable(s)
	}
}

func (s *OpTableContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitOpTable(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) OpTable() (localctx IOpTableContext) {
	localctx = NewOpTableContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, DBMSParserRULE_opTable)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(137)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 4, p.GetParserRuleContext()) {
	case 1:
		{
			p.SetState(128)
			p.CreateTable()
		}

	case 2:
		{
			p.SetState(129)
			p.AlterTable()
		}

	case 3:
		{
			p.SetState(130)
			p.DropTable()
		}

	case 4:
		{
			p.SetState(131)
			p.ShowTables()
		}

	case 5:
		{
			p.SetState(132)
			p.ShowColumns()
		}

	case 6:
		{
			p.SetState(133)
			p.InsertInto()
		}

	case 7:
		{
			p.SetState(134)
			p.UpdateSet()
		}

	case 8:
		{
			p.SetState(135)
			p.DeleteFrom()
		}

	case 9:
		{
			p.SetState(136)
			p.SelectFrom()
		}

	}

	return localctx
}

// ITipoContext is an interface to support dynamic dispatch.
type ITipoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsTipoContext differentiates from other interfaces.
	IsTipoContext()
}

type TipoContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyTipoContext() *TipoContext {
	var p = new(TipoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_tipo
	return p
}

func (*TipoContext) IsTipoContext() {}

func NewTipoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *TipoContext {
	var p = new(TipoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_tipo

	return p
}

func (s *TipoContext) GetParser() antlr.Parser { return s.parser }

func (s *TipoContext) INT() antlr.TerminalNode {
	return s.GetToken(DBMSParserINT, 0)
}

func (s *TipoContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(DBMSParserFLOAT, 0)
}

func (s *TipoContext) DATE() antlr.TerminalNode {
	return s.GetToken(DBMSParserDATE, 0)
}

func (s *TipoContext) CHAR() antlr.TerminalNode {
	return s.GetToken(DBMSParserCHAR, 0)
}

func (s *TipoContext) NUMX() antlr.TerminalNode {
	return s.GetToken(DBMSParserNUMX, 0)
}

func (s *TipoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *TipoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *TipoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterTipo(s)
	}
}

func (s *TipoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitTipo(s)
	}
}

func (s *TipoContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitTipo(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Tipo() (localctx ITipoContext) {
	localctx = NewTipoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 20, DBMSParserRULE_tipo)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(146)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBMSParserINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(139)
			p.Match(DBMSParserINT)
		}

	case DBMSParserFLOAT:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(140)
			p.Match(DBMSParserFLOAT)
		}

	case DBMSParserDATE:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(141)
			p.Match(DBMSParserDATE)
		}

	case DBMSParserCHAR:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(142)
			p.Match(DBMSParserCHAR)
		}
		{
			p.SetState(143)
			p.Match(DBMSParserT__1)
		}
		{
			p.SetState(144)
			p.Match(DBMSParserNUMX)
		}
		{
			p.SetState(145)
			p.Match(DBMSParserT__2)
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// ICreateTableContext is an interface to support dynamic dispatch.
type ICreateTableContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsCreateTableContext differentiates from other interfaces.
	IsCreateTableContext()
}

type CreateTableContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyCreateTableContext() *CreateTableContext {
	var p = new(CreateTableContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_createTable
	return p
}

func (*CreateTableContext) IsCreateTableContext() {}

func NewCreateTableContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *CreateTableContext {
	var p = new(CreateTableContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_createTable

	return p
}

func (s *CreateTableContext) GetParser() antlr.Parser { return s.parser }

func (s *CreateTableContext) CREATE() antlr.TerminalNode {
	return s.GetToken(DBMSParserCREATE, 0)
}

func (s *CreateTableContext) TABLE() antlr.TerminalNode {
	return s.GetToken(DBMSParserTABLE, 0)
}

func (s *CreateTableContext) AllIDX() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserIDX)
}

func (s *CreateTableContext) IDX(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, i)
}

func (s *CreateTableContext) AllTipo() []ITipoContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*ITipoContext)(nil)).Elem())
	var tst = make([]ITipoContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(ITipoContext)
		}
	}

	return tst
}

func (s *CreateTableContext) Tipo(i int) ITipoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITipoContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(ITipoContext)
}

func (s *CreateTableContext) AllCONSTRAINT() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserCONSTRAINT)
}

func (s *CreateTableContext) CONSTRAINT(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserCONSTRAINT, i)
}

func (s *CreateTableContext) AllConstraint() []IConstraintContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IConstraintContext)(nil)).Elem())
	var tst = make([]IConstraintContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IConstraintContext)
		}
	}

	return tst
}

func (s *CreateTableContext) Constraint(i int) IConstraintContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IConstraintContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IConstraintContext)
}

func (s *CreateTableContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *CreateTableContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *CreateTableContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterCreateTable(s)
	}
}

func (s *CreateTableContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitCreateTable(s)
	}
}

func (s *CreateTableContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitCreateTable(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) CreateTable() (localctx ICreateTableContext) {
	localctx = NewCreateTableContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 22, DBMSParserRULE_createTable)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(148)
		p.Match(DBMSParserCREATE)
	}
	{
		p.SetState(149)
		p.Match(DBMSParserTABLE)
	}
	{
		p.SetState(150)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(151)
		p.Match(DBMSParserT__1)
	}
	{
		p.SetState(152)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(153)
		p.Tipo()
	}
	p.SetState(159)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == DBMSParserT__3 {
		{
			p.SetState(154)
			p.Match(DBMSParserT__3)
		}
		{
			p.SetState(155)
			p.Match(DBMSParserIDX)
		}
		{
			p.SetState(156)
			p.Tipo()
		}

		p.SetState(161)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}
	p.SetState(172)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == DBMSParserCONSTRAINT {
		{
			p.SetState(162)
			p.Match(DBMSParserCONSTRAINT)
		}
		{
			p.SetState(163)
			p.Constraint()
		}
		p.SetState(169)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == DBMSParserT__3 {
			{
				p.SetState(164)
				p.Match(DBMSParserT__3)
			}
			{
				p.SetState(165)
				p.Match(DBMSParserCONSTRAINT)
			}
			{
				p.SetState(166)
				p.Constraint()
			}

			p.SetState(171)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}
	{
		p.SetState(174)
		p.Match(DBMSParserT__2)
	}

	return localctx
}

// IConstraintContext is an interface to support dynamic dispatch.
type IConstraintContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsConstraintContext differentiates from other interfaces.
	IsConstraintContext()
}

type ConstraintContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyConstraintContext() *ConstraintContext {
	var p = new(ConstraintContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_constraint
	return p
}

func (*ConstraintContext) IsConstraintContext() {}

func NewConstraintContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ConstraintContext {
	var p = new(ConstraintContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_constraint

	return p
}

func (s *ConstraintContext) GetParser() antlr.Parser { return s.parser }

func (s *ConstraintContext) PrimaryKey() IPrimaryKeyContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrimaryKeyContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrimaryKeyContext)
}

func (s *ConstraintContext) AllForeignKey() []IForeignKeyContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IForeignKeyContext)(nil)).Elem())
	var tst = make([]IForeignKeyContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IForeignKeyContext)
		}
	}

	return tst
}

func (s *ConstraintContext) ForeignKey(i int) IForeignKeyContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IForeignKeyContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IForeignKeyContext)
}

func (s *ConstraintContext) AllCheck() []ICheckContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*ICheckContext)(nil)).Elem())
	var tst = make([]ICheckContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(ICheckContext)
		}
	}

	return tst
}

func (s *ConstraintContext) Check(i int) ICheckContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ICheckContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(ICheckContext)
}

func (s *ConstraintContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ConstraintContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ConstraintContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterConstraint(s)
	}
}

func (s *ConstraintContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitConstraint(s)
	}
}

func (s *ConstraintContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitConstraint(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Constraint() (localctx IConstraintContext) {
	localctx = NewConstraintContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 24, DBMSParserRULE_constraint)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(191)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 11, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(176)
			p.PrimaryKey()
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(177)
			p.ForeignKey()
		}
		p.SetState(181)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == DBMSParserIDX {
			{
				p.SetState(178)
				p.ForeignKey()
			}

			p.SetState(183)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(184)
			p.Check()
		}
		p.SetState(188)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == DBMSParserIDX {
			{
				p.SetState(185)
				p.Check()
			}

			p.SetState(190)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}

	return localctx
}

// IPrimaryKeyContext is an interface to support dynamic dispatch.
type IPrimaryKeyContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsPrimaryKeyContext differentiates from other interfaces.
	IsPrimaryKeyContext()
}

type PrimaryKeyContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyPrimaryKeyContext() *PrimaryKeyContext {
	var p = new(PrimaryKeyContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_primaryKey
	return p
}

func (*PrimaryKeyContext) IsPrimaryKeyContext() {}

func NewPrimaryKeyContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrimaryKeyContext {
	var p = new(PrimaryKeyContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_primaryKey

	return p
}

func (s *PrimaryKeyContext) GetParser() antlr.Parser { return s.parser }

func (s *PrimaryKeyContext) AllIDX() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserIDX)
}

func (s *PrimaryKeyContext) IDX(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, i)
}

func (s *PrimaryKeyContext) PRIMARY() antlr.TerminalNode {
	return s.GetToken(DBMSParserPRIMARY, 0)
}

func (s *PrimaryKeyContext) KEY() antlr.TerminalNode {
	return s.GetToken(DBMSParserKEY, 0)
}

func (s *PrimaryKeyContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrimaryKeyContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrimaryKeyContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterPrimaryKey(s)
	}
}

func (s *PrimaryKeyContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitPrimaryKey(s)
	}
}

func (s *PrimaryKeyContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitPrimaryKey(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) PrimaryKey() (localctx IPrimaryKeyContext) {
	localctx = NewPrimaryKeyContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 26, DBMSParserRULE_primaryKey)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(193)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(194)
		p.Match(DBMSParserPRIMARY)
	}
	{
		p.SetState(195)
		p.Match(DBMSParserKEY)
	}
	{
		p.SetState(196)
		p.Match(DBMSParserT__1)
	}
	{
		p.SetState(197)
		p.Match(DBMSParserIDX)
	}
	p.SetState(202)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == DBMSParserT__3 {
		{
			p.SetState(198)
			p.Match(DBMSParserT__3)
		}
		{
			p.SetState(199)
			p.Match(DBMSParserIDX)
		}

		p.SetState(204)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(205)
		p.Match(DBMSParserT__2)
	}

	return localctx
}

// IForeignKeyContext is an interface to support dynamic dispatch.
type IForeignKeyContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsForeignKeyContext differentiates from other interfaces.
	IsForeignKeyContext()
}

type ForeignKeyContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyForeignKeyContext() *ForeignKeyContext {
	var p = new(ForeignKeyContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_foreignKey
	return p
}

func (*ForeignKeyContext) IsForeignKeyContext() {}

func NewForeignKeyContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ForeignKeyContext {
	var p = new(ForeignKeyContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_foreignKey

	return p
}

func (s *ForeignKeyContext) GetParser() antlr.Parser { return s.parser }

func (s *ForeignKeyContext) AllIDX() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserIDX)
}

func (s *ForeignKeyContext) IDX(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, i)
}

func (s *ForeignKeyContext) FOREIGN() antlr.TerminalNode {
	return s.GetToken(DBMSParserFOREIGN, 0)
}

func (s *ForeignKeyContext) KEY() antlr.TerminalNode {
	return s.GetToken(DBMSParserKEY, 0)
}

func (s *ForeignKeyContext) REFERENCES() antlr.TerminalNode {
	return s.GetToken(DBMSParserREFERENCES, 0)
}

func (s *ForeignKeyContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ForeignKeyContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ForeignKeyContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterForeignKey(s)
	}
}

func (s *ForeignKeyContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitForeignKey(s)
	}
}

func (s *ForeignKeyContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitForeignKey(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) ForeignKey() (localctx IForeignKeyContext) {
	localctx = NewForeignKeyContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 28, DBMSParserRULE_foreignKey)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(207)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(208)
		p.Match(DBMSParserFOREIGN)
	}
	{
		p.SetState(209)
		p.Match(DBMSParserKEY)
	}
	{
		p.SetState(210)
		p.Match(DBMSParserT__1)
	}
	{
		p.SetState(211)
		p.Match(DBMSParserIDX)
	}
	p.SetState(216)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == DBMSParserT__3 {
		{
			p.SetState(212)
			p.Match(DBMSParserT__3)
		}
		{
			p.SetState(213)
			p.Match(DBMSParserIDX)
		}

		p.SetState(218)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(219)
		p.Match(DBMSParserT__2)
	}
	{
		p.SetState(220)
		p.Match(DBMSParserREFERENCES)
	}
	{
		p.SetState(221)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(222)
		p.Match(DBMSParserT__1)
	}
	{
		p.SetState(223)
		p.Match(DBMSParserIDX)
	}
	p.SetState(228)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == DBMSParserT__3 {
		{
			p.SetState(224)
			p.Match(DBMSParserT__3)
		}
		{
			p.SetState(225)
			p.Match(DBMSParserIDX)
		}

		p.SetState(230)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(231)
		p.Match(DBMSParserT__2)
	}

	return localctx
}

// ICheckContext is an interface to support dynamic dispatch.
type ICheckContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsCheckContext differentiates from other interfaces.
	IsCheckContext()
}

type CheckContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyCheckContext() *CheckContext {
	var p = new(CheckContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_check
	return p
}

func (*CheckContext) IsCheckContext() {}

func NewCheckContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *CheckContext {
	var p = new(CheckContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_check

	return p
}

func (s *CheckContext) GetParser() antlr.Parser { return s.parser }

func (s *CheckContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *CheckContext) CHECK() antlr.TerminalNode {
	return s.GetToken(DBMSParserCHECK, 0)
}

func (s *CheckContext) Exp() IExpContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpContext)
}

func (s *CheckContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *CheckContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *CheckContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterCheck(s)
	}
}

func (s *CheckContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitCheck(s)
	}
}

func (s *CheckContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitCheck(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Check() (localctx ICheckContext) {
	localctx = NewCheckContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 30, DBMSParserRULE_check)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(233)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(234)
		p.Match(DBMSParserCHECK)
	}

	{
		p.SetState(235)
		p.Exp()
	}

	return localctx
}

// IExpContext is an interface to support dynamic dispatch.
type IExpContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsExpContext differentiates from other interfaces.
	IsExpContext()
}

type ExpContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyExpContext() *ExpContext {
	var p = new(ExpContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_exp
	return p
}

func (*ExpContext) IsExpContext() {}

func NewExpContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpContext {
	var p = new(ExpContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_exp

	return p
}

func (s *ExpContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ExpContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterExp(s)
	}
}

func (s *ExpContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitExp(s)
	}
}

func (s *ExpContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitExp(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Exp() (localctx IExpContext) {
	localctx = NewExpContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 32, DBMSParserRULE_exp)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(239)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBMSParserT__1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(237)
			p.expression(0)
		}

	case DBMSParserEOF, DBMSParserT__2, DBMSParserT__3, DBMSParserCREATE, DBMSParserALTER, DBMSParserDROP, DBMSParserSHOW, DBMSParserUSE, DBMSParserINSERT, DBMSParserSELECT, DBMSParserUPDATE, DBMSParserDELETE, DBMSParserORDER, DBMSParserASC, DBMSParserDESC, DBMSParserIDX:
		p.EnterOuterAlt(localctx, 2)

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IExpressionContext is an interface to support dynamic dispatch.
type IExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsExpressionContext differentiates from other interfaces.
	IsExpressionContext()
}

type ExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyExpressionContext() *ExpressionContext {
	var p = new(ExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_expression
	return p
}

func (*ExpressionContext) IsExpressionContext() {}

func NewExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpressionContext {
	var p = new(ExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_expression

	return p
}

func (s *ExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpressionContext) AndExpr() IAndExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAndExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAndExprContext)
}

func (s *ExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ExpressionContext) OR() antlr.TerminalNode {
	return s.GetToken(DBMSParserOR, 0)
}

func (s *ExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpressionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterExpression(s)
	}
}

func (s *ExpressionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitExpression(s)
	}
}

func (s *ExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Expression() (localctx IExpressionContext) {
	return p.expression(0)
}

func (p *DBMSParser) expression(_p int) (localctx IExpressionContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpressionContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpressionContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 34
	p.EnterRecursionRule(localctx, 34, DBMSParserRULE_expression, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(242)
		p.andExpr(0)
	}

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(249)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 16, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewExpressionContext(p, _parentctx, _parentState)
			p.PushNewRecursionContext(localctx, _startState, DBMSParserRULE_expression)
			p.SetState(244)

			if !(p.Precpred(p.GetParserRuleContext(), 1)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 1)", ""))
			}
			{
				p.SetState(245)
				p.Match(DBMSParserOR)
			}
			{
				p.SetState(246)
				p.andExpr(0)
			}

		}
		p.SetState(251)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 16, p.GetParserRuleContext())
	}

	return localctx
}

// IAndExprContext is an interface to support dynamic dispatch.
type IAndExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsAndExprContext differentiates from other interfaces.
	IsAndExprContext()
}

type AndExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyAndExprContext() *AndExprContext {
	var p = new(AndExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_andExpr
	return p
}

func (*AndExprContext) IsAndExprContext() {}

func NewAndExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AndExprContext {
	var p = new(AndExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_andExpr

	return p
}

func (s *AndExprContext) GetParser() antlr.Parser { return s.parser }

func (s *AndExprContext) EqExpr() IEqExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IEqExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IEqExprContext)
}

func (s *AndExprContext) AndExpr() IAndExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAndExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAndExprContext)
}

func (s *AndExprContext) AND() antlr.TerminalNode {
	return s.GetToken(DBMSParserAND, 0)
}

func (s *AndExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AndExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AndExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterAndExpr(s)
	}
}

func (s *AndExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitAndExpr(s)
	}
}

func (s *AndExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitAndExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) AndExpr() (localctx IAndExprContext) {
	return p.andExpr(0)
}

func (p *DBMSParser) andExpr(_p int) (localctx IAndExprContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewAndExprContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IAndExprContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 36
	p.EnterRecursionRule(localctx, 36, DBMSParserRULE_andExpr, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(253)
		p.eqExpr(0)
	}

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(260)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 17, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewAndExprContext(p, _parentctx, _parentState)
			p.PushNewRecursionContext(localctx, _startState, DBMSParserRULE_andExpr)
			p.SetState(255)

			if !(p.Precpred(p.GetParserRuleContext(), 1)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 1)", ""))
			}
			{
				p.SetState(256)
				p.Match(DBMSParserAND)
			}
			{
				p.SetState(257)
				p.eqExpr(0)
			}

		}
		p.SetState(262)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 17, p.GetParserRuleContext())
	}

	return localctx
}

// IEqExprContext is an interface to support dynamic dispatch.
type IEqExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsEqExprContext differentiates from other interfaces.
	IsEqExprContext()
}

type EqExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyEqExprContext() *EqExprContext {
	var p = new(EqExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_eqExpr
	return p
}

func (*EqExprContext) IsEqExprContext() {}

func NewEqExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *EqExprContext {
	var p = new(EqExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_eqExpr

	return p
}

func (s *EqExprContext) GetParser() antlr.Parser { return s.parser }

func (s *EqExprContext) RelationExpr() IRelationExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IRelationExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IRelationExprContext)
}

func (s *EqExprContext) EqExpr() IEqExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IEqExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IEqExprContext)
}

func (s *EqExprContext) Eq_op() IEq_opContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IEq_opContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IEq_opContext)
}

func (s *EqExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *EqExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *EqExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterEqExpr(s)
	}
}

func (s *EqExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitEqExpr(s)
	}
}

func (s *EqExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitEqExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) EqExpr() (localctx IEqExprContext) {
	return p.eqExpr(0)
}

func (p *DBMSParser) eqExpr(_p int) (localctx IEqExprContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewEqExprContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IEqExprContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 38
	p.EnterRecursionRule(localctx, 38, DBMSParserRULE_eqExpr, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(264)
		p.relationExpr(0)
	}

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(272)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewEqExprContext(p, _parentctx, _parentState)
			p.PushNewRecursionContext(localctx, _startState, DBMSParserRULE_eqExpr)
			p.SetState(266)

			if !(p.Precpred(p.GetParserRuleContext(), 1)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 1)", ""))
			}
			{
				p.SetState(267)
				p.Eq_op()
			}
			{
				p.SetState(268)
				p.relationExpr(0)
			}

		}
		p.SetState(274)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext())
	}

	return localctx
}

// IRelationExprContext is an interface to support dynamic dispatch.
type IRelationExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsRelationExprContext differentiates from other interfaces.
	IsRelationExprContext()
}

type RelationExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyRelationExprContext() *RelationExprContext {
	var p = new(RelationExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_relationExpr
	return p
}

func (*RelationExprContext) IsRelationExprContext() {}

func NewRelationExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *RelationExprContext {
	var p = new(RelationExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_relationExpr

	return p
}

func (s *RelationExprContext) GetParser() antlr.Parser { return s.parser }

func (s *RelationExprContext) UnaryExpr() IUnaryExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IUnaryExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IUnaryExprContext)
}

func (s *RelationExprContext) RelationExpr() IRelationExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IRelationExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IRelationExprContext)
}

func (s *RelationExprContext) Rel_op() IRel_opContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IRel_opContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IRel_opContext)
}

func (s *RelationExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *RelationExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *RelationExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterRelationExpr(s)
	}
}

func (s *RelationExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitRelationExpr(s)
	}
}

func (s *RelationExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitRelationExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) RelationExpr() (localctx IRelationExprContext) {
	return p.relationExpr(0)
}

func (p *DBMSParser) relationExpr(_p int) (localctx IRelationExprContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewRelationExprContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IRelationExprContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 40
	p.EnterRecursionRule(localctx, 40, DBMSParserRULE_relationExpr, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(276)
		p.UnaryExpr()
	}

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(284)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 19, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewRelationExprContext(p, _parentctx, _parentState)
			p.PushNewRecursionContext(localctx, _startState, DBMSParserRULE_relationExpr)
			p.SetState(278)

			if !(p.Precpred(p.GetParserRuleContext(), 1)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 1)", ""))
			}
			{
				p.SetState(279)
				p.Rel_op()
			}
			{
				p.SetState(280)
				p.UnaryExpr()
			}

		}
		p.SetState(286)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 19, p.GetParserRuleContext())
	}

	return localctx
}

// IUnaryExprContext is an interface to support dynamic dispatch.
type IUnaryExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsUnaryExprContext differentiates from other interfaces.
	IsUnaryExprContext()
}

type UnaryExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyUnaryExprContext() *UnaryExprContext {
	var p = new(UnaryExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_unaryExpr
	return p
}

func (*UnaryExprContext) IsUnaryExprContext() {}

func NewUnaryExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *UnaryExprContext {
	var p = new(UnaryExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_unaryExpr

	return p
}

func (s *UnaryExprContext) GetParser() antlr.Parser { return s.parser }

func (s *UnaryExprContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *UnaryExprContext) NOT() antlr.TerminalNode {
	return s.GetToken(DBMSParserNOT, 0)
}

func (s *UnaryExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *UnaryExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *UnaryExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterUnaryExpr(s)
	}
}

func (s *UnaryExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitUnaryExpr(s)
	}
}

func (s *UnaryExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitUnaryExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) UnaryExpr() (localctx IUnaryExprContext) {
	localctx = NewUnaryExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 42, DBMSParserRULE_unaryExpr)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(287)
		p.Match(DBMSParserT__1)
	}
	p.SetState(289)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == DBMSParserNOT {
		{
			p.SetState(288)
			p.Match(DBMSParserNOT)
		}

	}
	{
		p.SetState(291)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(292)
		p.Match(DBMSParserT__2)
	}

	return localctx
}

// IAlterTableContext is an interface to support dynamic dispatch.
type IAlterTableContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsAlterTableContext differentiates from other interfaces.
	IsAlterTableContext()
}

type AlterTableContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyAlterTableContext() *AlterTableContext {
	var p = new(AlterTableContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_alterTable
	return p
}

func (*AlterTableContext) IsAlterTableContext() {}

func NewAlterTableContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AlterTableContext {
	var p = new(AlterTableContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_alterTable

	return p
}

func (s *AlterTableContext) GetParser() antlr.Parser { return s.parser }

func (s *AlterTableContext) ALTER() antlr.TerminalNode {
	return s.GetToken(DBMSParserALTER, 0)
}

func (s *AlterTableContext) TABLE() antlr.TerminalNode {
	return s.GetToken(DBMSParserTABLE, 0)
}

func (s *AlterTableContext) AllIDX() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserIDX)
}

func (s *AlterTableContext) IDX(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, i)
}

func (s *AlterTableContext) RENAME() antlr.TerminalNode {
	return s.GetToken(DBMSParserRENAME, 0)
}

func (s *AlterTableContext) TO() antlr.TerminalNode {
	return s.GetToken(DBMSParserTO, 0)
}

func (s *AlterTableContext) AllAction() []IActionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IActionContext)(nil)).Elem())
	var tst = make([]IActionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IActionContext)
		}
	}

	return tst
}

func (s *AlterTableContext) Action(i int) IActionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IActionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IActionContext)
}

func (s *AlterTableContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AlterTableContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AlterTableContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterAlterTable(s)
	}
}

func (s *AlterTableContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitAlterTable(s)
	}
}

func (s *AlterTableContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitAlterTable(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) AlterTable() (localctx IAlterTableContext) {
	localctx = NewAlterTableContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 44, DBMSParserRULE_alterTable)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(311)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 22, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(294)
			p.Match(DBMSParserALTER)
		}
		{
			p.SetState(295)
			p.Match(DBMSParserTABLE)
		}
		{
			p.SetState(296)
			p.Match(DBMSParserIDX)
		}
		{
			p.SetState(297)
			p.Match(DBMSParserRENAME)
		}
		{
			p.SetState(298)
			p.Match(DBMSParserTO)
		}
		{
			p.SetState(299)
			p.Match(DBMSParserIDX)
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(300)
			p.Match(DBMSParserALTER)
		}
		{
			p.SetState(301)
			p.Match(DBMSParserTABLE)
		}
		{
			p.SetState(302)
			p.Match(DBMSParserIDX)
		}
		{
			p.SetState(303)
			p.Action()
		}
		p.SetState(308)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == DBMSParserT__3 {
			{
				p.SetState(304)
				p.Match(DBMSParserT__3)
			}
			{
				p.SetState(305)
				p.Action()
			}

			p.SetState(310)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}

	return localctx
}

// IActionContext is an interface to support dynamic dispatch.
type IActionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsActionContext differentiates from other interfaces.
	IsActionContext()
}

type ActionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyActionContext() *ActionContext {
	var p = new(ActionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_action
	return p
}

func (*ActionContext) IsActionContext() {}

func NewActionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ActionContext {
	var p = new(ActionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_action

	return p
}

func (s *ActionContext) GetParser() antlr.Parser { return s.parser }

func (s *ActionContext) ADD() antlr.TerminalNode {
	return s.GetToken(DBMSParserADD, 0)
}

func (s *ActionContext) COLUMN() antlr.TerminalNode {
	return s.GetToken(DBMSParserCOLUMN, 0)
}

func (s *ActionContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *ActionContext) Tipo() ITipoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITipoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITipoContext)
}

func (s *ActionContext) CONSTRAINT() antlr.TerminalNode {
	return s.GetToken(DBMSParserCONSTRAINT, 0)
}

func (s *ActionContext) AllConstraint() []IConstraintContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IConstraintContext)(nil)).Elem())
	var tst = make([]IConstraintContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IConstraintContext)
		}
	}

	return tst
}

func (s *ActionContext) Constraint(i int) IConstraintContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IConstraintContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IConstraintContext)
}

func (s *ActionContext) DROP() antlr.TerminalNode {
	return s.GetToken(DBMSParserDROP, 0)
}

func (s *ActionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ActionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ActionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterAction(s)
	}
}

func (s *ActionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitAction(s)
	}
}

func (s *ActionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitAction(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Action() (localctx IActionContext) {
	localctx = NewActionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 46, DBMSParserRULE_action)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.SetState(337)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 25, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(313)
			p.Match(DBMSParserADD)
		}
		{
			p.SetState(314)
			p.Match(DBMSParserCOLUMN)
		}
		{
			p.SetState(315)
			p.Match(DBMSParserIDX)
		}
		{
			p.SetState(316)
			p.Tipo()
		}
		p.SetState(326)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if _la == DBMSParserCONSTRAINT {
			{
				p.SetState(317)
				p.Match(DBMSParserCONSTRAINT)
			}
			{
				p.SetState(318)
				p.Constraint()
			}
			p.SetState(323)
			p.GetErrorHandler().Sync(p)
			_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 23, p.GetParserRuleContext())

			for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
				if _alt == 1 {
					{
						p.SetState(319)
						p.Match(DBMSParserT__3)
					}
					{
						p.SetState(320)
						p.Constraint()
					}

				}
				p.SetState(325)
				p.GetErrorHandler().Sync(p)
				_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 23, p.GetParserRuleContext())
			}

		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(328)
			p.Match(DBMSParserADD)
		}
		{
			p.SetState(329)
			p.Match(DBMSParserCONSTRAINT)
		}
		{
			p.SetState(330)
			p.Constraint()
		}

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(331)
			p.Match(DBMSParserDROP)
		}
		{
			p.SetState(332)
			p.Match(DBMSParserCOLUMN)
		}
		{
			p.SetState(333)
			p.Match(DBMSParserIDX)
		}

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(334)
			p.Match(DBMSParserDROP)
		}
		{
			p.SetState(335)
			p.Match(DBMSParserCONSTRAINT)
		}
		{
			p.SetState(336)
			p.Match(DBMSParserIDX)
		}

	}

	return localctx
}

// IDropTableContext is an interface to support dynamic dispatch.
type IDropTableContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsDropTableContext differentiates from other interfaces.
	IsDropTableContext()
}

type DropTableContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyDropTableContext() *DropTableContext {
	var p = new(DropTableContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_dropTable
	return p
}

func (*DropTableContext) IsDropTableContext() {}

func NewDropTableContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DropTableContext {
	var p = new(DropTableContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_dropTable

	return p
}

func (s *DropTableContext) GetParser() antlr.Parser { return s.parser }

func (s *DropTableContext) DROP() antlr.TerminalNode {
	return s.GetToken(DBMSParserDROP, 0)
}

func (s *DropTableContext) TABLE() antlr.TerminalNode {
	return s.GetToken(DBMSParserTABLE, 0)
}

func (s *DropTableContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *DropTableContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DropTableContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DropTableContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterDropTable(s)
	}
}

func (s *DropTableContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitDropTable(s)
	}
}

func (s *DropTableContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitDropTable(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) DropTable() (localctx IDropTableContext) {
	localctx = NewDropTableContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 48, DBMSParserRULE_dropTable)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(339)
		p.Match(DBMSParserDROP)
	}
	{
		p.SetState(340)
		p.Match(DBMSParserTABLE)
	}
	{
		p.SetState(341)
		p.Match(DBMSParserIDX)
	}

	return localctx
}

// IShowTablesContext is an interface to support dynamic dispatch.
type IShowTablesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsShowTablesContext differentiates from other interfaces.
	IsShowTablesContext()
}

type ShowTablesContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyShowTablesContext() *ShowTablesContext {
	var p = new(ShowTablesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_showTables
	return p
}

func (*ShowTablesContext) IsShowTablesContext() {}

func NewShowTablesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ShowTablesContext {
	var p = new(ShowTablesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_showTables

	return p
}

func (s *ShowTablesContext) GetParser() antlr.Parser { return s.parser }

func (s *ShowTablesContext) SHOW() antlr.TerminalNode {
	return s.GetToken(DBMSParserSHOW, 0)
}

func (s *ShowTablesContext) TABLES() antlr.TerminalNode {
	return s.GetToken(DBMSParserTABLES, 0)
}

func (s *ShowTablesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ShowTablesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ShowTablesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterShowTables(s)
	}
}

func (s *ShowTablesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitShowTables(s)
	}
}

func (s *ShowTablesContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitShowTables(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) ShowTables() (localctx IShowTablesContext) {
	localctx = NewShowTablesContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 50, DBMSParserRULE_showTables)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(343)
		p.Match(DBMSParserSHOW)
	}
	{
		p.SetState(344)
		p.Match(DBMSParserTABLES)
	}

	return localctx
}

// IShowColumnsContext is an interface to support dynamic dispatch.
type IShowColumnsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsShowColumnsContext differentiates from other interfaces.
	IsShowColumnsContext()
}

type ShowColumnsContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyShowColumnsContext() *ShowColumnsContext {
	var p = new(ShowColumnsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_showColumns
	return p
}

func (*ShowColumnsContext) IsShowColumnsContext() {}

func NewShowColumnsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ShowColumnsContext {
	var p = new(ShowColumnsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_showColumns

	return p
}

func (s *ShowColumnsContext) GetParser() antlr.Parser { return s.parser }

func (s *ShowColumnsContext) SHOW() antlr.TerminalNode {
	return s.GetToken(DBMSParserSHOW, 0)
}

func (s *ShowColumnsContext) COLUMNS() antlr.TerminalNode {
	return s.GetToken(DBMSParserCOLUMNS, 0)
}

func (s *ShowColumnsContext) FROM() antlr.TerminalNode {
	return s.GetToken(DBMSParserFROM, 0)
}

func (s *ShowColumnsContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *ShowColumnsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ShowColumnsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ShowColumnsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterShowColumns(s)
	}
}

func (s *ShowColumnsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitShowColumns(s)
	}
}

func (s *ShowColumnsContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitShowColumns(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) ShowColumns() (localctx IShowColumnsContext) {
	localctx = NewShowColumnsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 52, DBMSParserRULE_showColumns)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(346)
		p.Match(DBMSParserSHOW)
	}
	{
		p.SetState(347)
		p.Match(DBMSParserCOLUMNS)
	}
	{
		p.SetState(348)
		p.Match(DBMSParserFROM)
	}
	{
		p.SetState(349)
		p.Match(DBMSParserIDX)
	}

	return localctx
}

// IInsertIntoContext is an interface to support dynamic dispatch.
type IInsertIntoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsInsertIntoContext differentiates from other interfaces.
	IsInsertIntoContext()
}

type InsertIntoContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyInsertIntoContext() *InsertIntoContext {
	var p = new(InsertIntoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_insertInto
	return p
}

func (*InsertIntoContext) IsInsertIntoContext() {}

func NewInsertIntoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InsertIntoContext {
	var p = new(InsertIntoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_insertInto

	return p
}

func (s *InsertIntoContext) GetParser() antlr.Parser { return s.parser }

func (s *InsertIntoContext) INSERT() antlr.TerminalNode {
	return s.GetToken(DBMSParserINSERT, 0)
}

func (s *InsertIntoContext) INTO() antlr.TerminalNode {
	return s.GetToken(DBMSParserINTO, 0)
}

func (s *InsertIntoContext) AllIDX() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserIDX)
}

func (s *InsertIntoContext) IDX(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, i)
}

func (s *InsertIntoContext) VALUES() antlr.TerminalNode {
	return s.GetToken(DBMSParserVALUES, 0)
}

func (s *InsertIntoContext) AllLiteral() []ILiteralContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*ILiteralContext)(nil)).Elem())
	var tst = make([]ILiteralContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(ILiteralContext)
		}
	}

	return tst
}

func (s *InsertIntoContext) Literal(i int) ILiteralContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ILiteralContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(ILiteralContext)
}

func (s *InsertIntoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InsertIntoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InsertIntoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterInsertInto(s)
	}
}

func (s *InsertIntoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitInsertInto(s)
	}
}

func (s *InsertIntoContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitInsertInto(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) InsertInto() (localctx IInsertIntoContext) {
	localctx = NewInsertIntoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 54, DBMSParserRULE_insertInto)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(351)
		p.Match(DBMSParserINSERT)
	}
	{
		p.SetState(352)
		p.Match(DBMSParserINTO)
	}
	{
		p.SetState(353)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(354)
		p.Match(DBMSParserT__1)
	}
	{
		p.SetState(355)
		p.Match(DBMSParserIDX)
	}
	p.SetState(360)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == DBMSParserT__3 {
		{
			p.SetState(356)
			p.Match(DBMSParserT__3)
		}
		{
			p.SetState(357)
			p.Match(DBMSParserIDX)
		}

		p.SetState(362)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(363)
		p.Match(DBMSParserT__2)
	}
	{
		p.SetState(364)
		p.Match(DBMSParserVALUES)
	}
	{
		p.SetState(365)
		p.Match(DBMSParserT__1)
	}
	{
		p.SetState(366)
		p.Literal()
	}
	p.SetState(371)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == DBMSParserT__3 {
		{
			p.SetState(367)
			p.Match(DBMSParserT__3)
		}
		{
			p.SetState(368)
			p.Literal()
		}

		p.SetState(373)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(374)
		p.Match(DBMSParserT__2)
	}

	return localctx
}

// IUpdateSetContext is an interface to support dynamic dispatch.
type IUpdateSetContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsUpdateSetContext differentiates from other interfaces.
	IsUpdateSetContext()
}

type UpdateSetContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyUpdateSetContext() *UpdateSetContext {
	var p = new(UpdateSetContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_updateSet
	return p
}

func (*UpdateSetContext) IsUpdateSetContext() {}

func NewUpdateSetContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *UpdateSetContext {
	var p = new(UpdateSetContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_updateSet

	return p
}

func (s *UpdateSetContext) GetParser() antlr.Parser { return s.parser }

func (s *UpdateSetContext) UPDATE() antlr.TerminalNode {
	return s.GetToken(DBMSParserUPDATE, 0)
}

func (s *UpdateSetContext) AllIDX() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserIDX)
}

func (s *UpdateSetContext) IDX(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, i)
}

func (s *UpdateSetContext) SET() antlr.TerminalNode {
	return s.GetToken(DBMSParserSET, 0)
}

func (s *UpdateSetContext) AllTipo() []ITipoContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*ITipoContext)(nil)).Elem())
	var tst = make([]ITipoContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(ITipoContext)
		}
	}

	return tst
}

func (s *UpdateSetContext) Tipo(i int) ITipoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITipoContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(ITipoContext)
}

func (s *UpdateSetContext) WHERE() antlr.TerminalNode {
	return s.GetToken(DBMSParserWHERE, 0)
}

func (s *UpdateSetContext) Exp() IExpContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpContext)
}

func (s *UpdateSetContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *UpdateSetContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *UpdateSetContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterUpdateSet(s)
	}
}

func (s *UpdateSetContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitUpdateSet(s)
	}
}

func (s *UpdateSetContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitUpdateSet(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) UpdateSet() (localctx IUpdateSetContext) {
	localctx = NewUpdateSetContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 56, DBMSParserRULE_updateSet)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(376)
		p.Match(DBMSParserUPDATE)
	}
	{
		p.SetState(377)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(378)
		p.Match(DBMSParserSET)
	}
	{
		p.SetState(379)
		p.Match(DBMSParserIDX)
	}
	{
		p.SetState(380)
		p.Match(DBMSParserT__4)
	}
	{
		p.SetState(381)
		p.Tipo()
	}
	p.SetState(386)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == DBMSParserT__3 {
		{
			p.SetState(382)
			p.Match(DBMSParserT__3)
		}
		{
			p.SetState(383)
			p.Tipo()
		}

		p.SetState(388)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}
	p.SetState(391)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == DBMSParserWHERE {
		{
			p.SetState(389)
			p.Match(DBMSParserWHERE)
		}
		{
			p.SetState(390)
			p.Exp()
		}

	}

	return localctx
}

// IDeleteFromContext is an interface to support dynamic dispatch.
type IDeleteFromContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsDeleteFromContext differentiates from other interfaces.
	IsDeleteFromContext()
}

type DeleteFromContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyDeleteFromContext() *DeleteFromContext {
	var p = new(DeleteFromContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_deleteFrom
	return p
}

func (*DeleteFromContext) IsDeleteFromContext() {}

func NewDeleteFromContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DeleteFromContext {
	var p = new(DeleteFromContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_deleteFrom

	return p
}

func (s *DeleteFromContext) GetParser() antlr.Parser { return s.parser }

func (s *DeleteFromContext) DELETE() antlr.TerminalNode {
	return s.GetToken(DBMSParserDELETE, 0)
}

func (s *DeleteFromContext) FROM() antlr.TerminalNode {
	return s.GetToken(DBMSParserFROM, 0)
}

func (s *DeleteFromContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *DeleteFromContext) WHERE() antlr.TerminalNode {
	return s.GetToken(DBMSParserWHERE, 0)
}

func (s *DeleteFromContext) Exp() IExpContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpContext)
}

func (s *DeleteFromContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DeleteFromContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DeleteFromContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterDeleteFrom(s)
	}
}

func (s *DeleteFromContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitDeleteFrom(s)
	}
}

func (s *DeleteFromContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitDeleteFrom(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) DeleteFrom() (localctx IDeleteFromContext) {
	localctx = NewDeleteFromContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 58, DBMSParserRULE_deleteFrom)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(393)
		p.Match(DBMSParserDELETE)
	}
	{
		p.SetState(394)
		p.Match(DBMSParserFROM)
	}
	{
		p.SetState(395)
		p.Match(DBMSParserIDX)
	}
	p.SetState(398)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == DBMSParserWHERE {
		{
			p.SetState(396)
			p.Match(DBMSParserWHERE)
		}
		{
			p.SetState(397)
			p.Exp()
		}

	}

	return localctx
}

// ISelectFromContext is an interface to support dynamic dispatch.
type ISelectFromContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsSelectFromContext differentiates from other interfaces.
	IsSelectFromContext()
}

type SelectFromContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySelectFromContext() *SelectFromContext {
	var p = new(SelectFromContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_selectFrom
	return p
}

func (*SelectFromContext) IsSelectFromContext() {}

func NewSelectFromContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SelectFromContext {
	var p = new(SelectFromContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_selectFrom

	return p
}

func (s *SelectFromContext) GetParser() antlr.Parser { return s.parser }

func (s *SelectFromContext) SELECT() antlr.TerminalNode {
	return s.GetToken(DBMSParserSELECT, 0)
}

func (s *SelectFromContext) Sep() ISepContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ISepContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ISepContext)
}

func (s *SelectFromContext) FROM() antlr.TerminalNode {
	return s.GetToken(DBMSParserFROM, 0)
}

func (s *SelectFromContext) IDX() antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, 0)
}

func (s *SelectFromContext) WHERE() antlr.TerminalNode {
	return s.GetToken(DBMSParserWHERE, 0)
}

func (s *SelectFromContext) AllExp() []IExpContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpContext)(nil)).Elem())
	var tst = make([]IExpContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpContext)
		}
	}

	return tst
}

func (s *SelectFromContext) Exp(i int) IExpContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpContext)
}

func (s *SelectFromContext) ORDER() antlr.TerminalNode {
	return s.GetToken(DBMSParserORDER, 0)
}

func (s *SelectFromContext) BY() antlr.TerminalNode {
	return s.GetToken(DBMSParserBY, 0)
}

func (s *SelectFromContext) AllASC() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserASC)
}

func (s *SelectFromContext) ASC(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserASC, i)
}

func (s *SelectFromContext) AllDESC() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserDESC)
}

func (s *SelectFromContext) DESC(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserDESC, i)
}

func (s *SelectFromContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SelectFromContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SelectFromContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterSelectFrom(s)
	}
}

func (s *SelectFromContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitSelectFrom(s)
	}
}

func (s *SelectFromContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitSelectFrom(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) SelectFrom() (localctx ISelectFromContext) {
	localctx = NewSelectFromContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 60, DBMSParserRULE_selectFrom)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(400)
		p.Match(DBMSParserSELECT)
	}
	{
		p.SetState(401)
		p.Sep()
	}
	{
		p.SetState(402)
		p.Match(DBMSParserFROM)
	}
	{
		p.SetState(403)
		p.Match(DBMSParserIDX)
	}
	p.SetState(424)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == DBMSParserWHERE {
		{
			p.SetState(404)
			p.Match(DBMSParserWHERE)
		}
		{
			p.SetState(405)
			p.Exp()
		}
		p.SetState(422)
		p.GetErrorHandler().Sync(p)

		switch p.GetTokenStream().LA(1) {
		case DBMSParserORDER:
			{
				p.SetState(406)
				p.Match(DBMSParserORDER)
			}
			{
				p.SetState(407)
				p.Match(DBMSParserBY)
			}
			{
				p.SetState(408)
				p.Exp()
			}
			{
				p.SetState(409)
				p.Match(DBMSParserASC)
			}

		case DBMSParserDESC:
			{
				p.SetState(411)
				p.Match(DBMSParserDESC)
			}
			p.SetState(419)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)

			for _la == DBMSParserT__3 || _la == DBMSParserDESC {
				p.SetState(417)
				p.GetErrorHandler().Sync(p)

				switch p.GetTokenStream().LA(1) {
				case DBMSParserT__3:
					{
						p.SetState(412)
						p.Match(DBMSParserT__3)
					}
					{
						p.SetState(413)
						p.Exp()
					}
					{
						p.SetState(414)
						p.Match(DBMSParserASC)
					}

				case DBMSParserDESC:
					{
						p.SetState(416)
						p.Match(DBMSParserDESC)
					}

				default:
					panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
				}

				p.SetState(421)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)
			}

		case DBMSParserEOF, DBMSParserCREATE, DBMSParserALTER, DBMSParserDROP, DBMSParserSHOW, DBMSParserUSE, DBMSParserINSERT, DBMSParserSELECT, DBMSParserUPDATE, DBMSParserDELETE:

		default:
			panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		}

	}

	return localctx
}

// ISepContext is an interface to support dynamic dispatch.
type ISepContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsSepContext differentiates from other interfaces.
	IsSepContext()
}

type SepContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySepContext() *SepContext {
	var p = new(SepContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_sep
	return p
}

func (*SepContext) IsSepContext() {}

func NewSepContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SepContext {
	var p = new(SepContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_sep

	return p
}

func (s *SepContext) GetParser() antlr.Parser { return s.parser }

func (s *SepContext) AllIDX() []antlr.TerminalNode {
	return s.GetTokens(DBMSParserIDX)
}

func (s *SepContext) IDX(i int) antlr.TerminalNode {
	return s.GetToken(DBMSParserIDX, i)
}

func (s *SepContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SepContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SepContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterSep(s)
	}
}

func (s *SepContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitSep(s)
	}
}

func (s *SepContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitSep(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Sep() (localctx ISepContext) {
	localctx = NewSepContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 62, DBMSParserRULE_sep)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(435)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBMSParserT__5:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(426)
			p.Match(DBMSParserT__5)
		}

	case DBMSParserIDX:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(427)
			p.Match(DBMSParserIDX)
		}
		p.SetState(432)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == DBMSParserT__3 {
			{
				p.SetState(428)
				p.Match(DBMSParserT__3)
			}
			{
				p.SetState(429)
				p.Match(DBMSParserIDX)
			}

			p.SetState(434)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IRel_opContext is an interface to support dynamic dispatch.
type IRel_opContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsRel_opContext differentiates from other interfaces.
	IsRel_opContext()
}

type Rel_opContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyRel_opContext() *Rel_opContext {
	var p = new(Rel_opContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_rel_op
	return p
}

func (*Rel_opContext) IsRel_opContext() {}

func NewRel_opContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Rel_opContext {
	var p = new(Rel_opContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_rel_op

	return p
}

func (s *Rel_opContext) GetParser() antlr.Parser { return s.parser }
func (s *Rel_opContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Rel_opContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Rel_opContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterRel_op(s)
	}
}

func (s *Rel_opContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitRel_op(s)
	}
}

func (s *Rel_opContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitRel_op(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Rel_op() (localctx IRel_opContext) {
	localctx = NewRel_opContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 64, DBMSParserRULE_rel_op)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(437)
	_la = p.GetTokenStream().LA(1)

	if !(((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<DBMSParserT__4)|(1<<DBMSParserT__6)|(1<<DBMSParserT__7)|(1<<DBMSParserT__8)|(1<<DBMSParserT__9))) != 0) {
		p.GetErrorHandler().RecoverInline(p)
	} else {
		p.GetErrorHandler().ReportMatch(p)
		p.Consume()
	}

	return localctx
}

// IEq_opContext is an interface to support dynamic dispatch.
type IEq_opContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsEq_opContext differentiates from other interfaces.
	IsEq_opContext()
}

type Eq_opContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyEq_opContext() *Eq_opContext {
	var p = new(Eq_opContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_eq_op
	return p
}

func (*Eq_opContext) IsEq_opContext() {}

func NewEq_opContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Eq_opContext {
	var p = new(Eq_opContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_eq_op

	return p
}

func (s *Eq_opContext) GetParser() antlr.Parser { return s.parser }
func (s *Eq_opContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Eq_opContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Eq_opContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterEq_op(s)
	}
}

func (s *Eq_opContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitEq_op(s)
	}
}

func (s *Eq_opContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitEq_op(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Eq_op() (localctx IEq_opContext) {
	localctx = NewEq_opContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 66, DBMSParserRULE_eq_op)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(439)
	_la = p.GetTokenStream().LA(1)

	if !(_la == DBMSParserT__10 || _la == DBMSParserT__11) {
		p.GetErrorHandler().RecoverInline(p)
	} else {
		p.GetErrorHandler().ReportMatch(p)
		p.Consume()
	}

	return localctx
}

// IAdd_opContext is an interface to support dynamic dispatch.
type IAdd_opContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsAdd_opContext differentiates from other interfaces.
	IsAdd_opContext()
}

type Add_opContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyAdd_opContext() *Add_opContext {
	var p = new(Add_opContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_add_op
	return p
}

func (*Add_opContext) IsAdd_opContext() {}

func NewAdd_opContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Add_opContext {
	var p = new(Add_opContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_add_op

	return p
}

func (s *Add_opContext) GetParser() antlr.Parser { return s.parser }
func (s *Add_opContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Add_opContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Add_opContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterAdd_op(s)
	}
}

func (s *Add_opContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitAdd_op(s)
	}
}

func (s *Add_opContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitAdd_op(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Add_op() (localctx IAdd_opContext) {
	localctx = NewAdd_opContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 68, DBMSParserRULE_add_op)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(441)
	_la = p.GetTokenStream().LA(1)

	if !(_la == DBMSParserT__0 || _la == DBMSParserT__12) {
		p.GetErrorHandler().RecoverInline(p)
	} else {
		p.GetErrorHandler().ReportMatch(p)
		p.Consume()
	}

	return localctx
}

// IMult_opContext is an interface to support dynamic dispatch.
type IMult_opContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsMult_opContext differentiates from other interfaces.
	IsMult_opContext()
}

type Mult_opContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyMult_opContext() *Mult_opContext {
	var p = new(Mult_opContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBMSParserRULE_mult_op
	return p
}

func (*Mult_opContext) IsMult_opContext() {}

func NewMult_opContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Mult_opContext {
	var p = new(Mult_opContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBMSParserRULE_mult_op

	return p
}

func (s *Mult_opContext) GetParser() antlr.Parser { return s.parser }
func (s *Mult_opContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Mult_opContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Mult_opContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.EnterMult_op(s)
	}
}

func (s *Mult_opContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBMSListener); ok {
		listenerT.ExitMult_op(s)
	}
}

func (s *Mult_opContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case DBMSVisitor:
		return t.VisitMult_op(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *DBMSParser) Mult_op() (localctx IMult_opContext) {
	localctx = NewMult_opContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 70, DBMSParserRULE_mult_op)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(443)
	_la = p.GetTokenStream().LA(1)

	if !(((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<DBMSParserT__5)|(1<<DBMSParserT__13)|(1<<DBMSParserT__14))) != 0) {
		p.GetErrorHandler().RecoverInline(p)
	} else {
		p.GetErrorHandler().ReportMatch(p)
		p.Consume()
	}

	return localctx
}

func (p *DBMSParser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 17:
		var t *ExpressionContext = nil
		if localctx != nil {
			t = localctx.(*ExpressionContext)
		}
		return p.Expression_Sempred(t, predIndex)

	case 18:
		var t *AndExprContext = nil
		if localctx != nil {
			t = localctx.(*AndExprContext)
		}
		return p.AndExpr_Sempred(t, predIndex)

	case 19:
		var t *EqExprContext = nil
		if localctx != nil {
			t = localctx.(*EqExprContext)
		}
		return p.EqExpr_Sempred(t, predIndex)

	case 20:
		var t *RelationExprContext = nil
		if localctx != nil {
			t = localctx.(*RelationExprContext)
		}
		return p.RelationExpr_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *DBMSParser) Expression_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 1)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *DBMSParser) AndExpr_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 1:
		return p.Precpred(p.GetParserRuleContext(), 1)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *DBMSParser) EqExpr_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 2:
		return p.Precpred(p.GetParserRuleContext(), 1)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *DBMSParser) RelationExpr_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 3:
		return p.Precpred(p.GetParserRuleContext(), 1)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
