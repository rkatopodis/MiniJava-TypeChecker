// Output created by jacc on Wed Jun 07 13:42:09 BRT 2017

package minijava;

import minijava.ast.*;

class Parser implements Tokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (tipo
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case CLASS:
                            yyn = 2;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 306;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    switch (yytok) {
                        case ID:
                            yyn = 3;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    switch (yytok) {
                        case '{':
                            yyn = 4;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 5;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    switch (yytok) {
                        case STATIC:
                            yyn = 6;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
                    switch (yytok) {
                        case VOID:
                            yyn = 7;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    switch (yytok) {
                        case MAIN:
                            yyn = 8;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    switch (yytok) {
                        case '(':
                            yyn = 9;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case STRING:
                            yyn = 10;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    switch (yytok) {
                        case '[':
                            yyn = 11;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    switch (yytok) {
                        case ']':
                            yyn = 12;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    switch (yytok) {
                        case ')':
                            yyn = 14;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    switch (yytok) {
                        case '{':
                            yyn = 15;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    switch (yytok) {
                        case ID:
                            yyn = 17;
                            continue;
                        case IF:
                            yyn = 18;
                            continue;
                        case PRINTLN:
                            yyn = 19;
                            continue;
                        case WHILE:
                            yyn = 20;
                            continue;
                        case '{':
                            yyn = 21;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    switch (yytok) {
                        case '}':
                            yyn = 22;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    switch (yytok) {
                        case '=':
                            yyn = 23;
                            continue;
                        case '[':
                            yyn = 24;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    switch (yytok) {
                        case '(':
                            yyn = 25;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    switch (yytok) {
                        case '(':
                            yyn = 26;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    switch (yytok) {
                        case '(':
                            yyn = 27;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    switch (yytok) {
                        case '}':
                            yyn = 30;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    switch (yytok) {
                        case '}':
                            yyn = 48;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 185:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 187:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    switch (yytok) {
                        case ID:
                            yyn = 61;
                            continue;
                        case INT:
                            yyn = 62;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 190:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 191:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 198:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 199:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 200:
                    switch (yytok) {
                        case '}':
                        case RETURN:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 201:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 202:
                    switch (yytok) {
                        case CLASS:
                            yyn = 71;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 204:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 205:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 206:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 207:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 208:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 209:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 211:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 212:
                    switch (yytok) {
                        case ID:
                            yyn = 80;
                            continue;
                        case LENGTH:
                            yyn = 81;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 214:
                    switch (yytok) {
                        case '(':
                            yyn = 83;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 215:
                    switch (yytok) {
                        case '[':
                            yyn = 84;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 216:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 217:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 218:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 219:
                    switch (yytok) {
                        case '=':
                            yyn = 86;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 220:
                    switch (yytok) {
                        case ID:
                            yyn = 17;
                            continue;
                        case IF:
                            yyn = 18;
                            continue;
                        case PRINTLN:
                            yyn = 19;
                            continue;
                        case WHILE:
                            yyn = 20;
                            continue;
                        case '{':
                            yyn = 21;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 221:
                    switch (yytok) {
                        case ';':
                            yyn = 88;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 222:
                    switch (yytok) {
                        case ID:
                            yyn = 17;
                            continue;
                        case IF:
                            yyn = 18;
                            continue;
                        case PRINTLN:
                            yyn = 19;
                            continue;
                        case WHILE:
                            yyn = 20;
                            continue;
                        case '{':
                            yyn = 21;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 223:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 224:
                    switch (yytok) {
                        case ID:
                            yyn = 90;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 225:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 226:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 227:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 228:
                    yyn = yys75();
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 229:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 230:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 232:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 233:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 234:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 235:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 236:
                    switch (yytok) {
                        case ')':
                            yyn = 93;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 238:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 239:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 240:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 241:
                    yyn = yys88();
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 242:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 243:
                    switch (yytok) {
                        case EXTENDS:
                            yyn = 97;
                            continue;
                        case '{':
                            yyn = 98;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 244:
                    yyn = yys91();
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 245:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 246:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 247:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 248:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 249:
                    switch (yytok) {
                        case ID:
                            yyn = 17;
                            continue;
                        case IF:
                            yyn = 18;
                            continue;
                        case PRINTLN:
                            yyn = 19;
                            continue;
                        case WHILE:
                            yyn = 20;
                            continue;
                        case '{':
                            yyn = 21;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 250:
                    switch (yytok) {
                        case ID:
                            yyn = 105;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 251:
                    switch (yytok) {
                        case '}':
                        case INT:
                        case PUBLIC:
                        case ID:
                        case BOOLEAN:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 252:
                    yyn = yys99();
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 253:
                    switch (yytok) {
                        case ')':
                            yyn = 107;
                            continue;
                        case ',':
                            yyn = 108;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 254:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 255:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 256:
                    yyn = yys103();
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 257:
                    yyn = yys104();
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 258:
                    switch (yytok) {
                        case '{':
                            yyn = 109;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 259:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 113;
                            continue;
                        case ID:
                            yyn = 114;
                            continue;
                        case INT:
                            yyn = 115;
                            continue;
                        case '}':
                        case PUBLIC:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 260:
                    yyn = yys107();
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 261:
                    yyn = yys108();
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 262:
                    switch (yytok) {
                        case '}':
                        case INT:
                        case PUBLIC:
                        case ID:
                        case BOOLEAN:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 263:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 119;
                            continue;
                        case '}':
                            yyn = 120;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 264:
                    switch (yytok) {
                        case ID:
                            yyn = 121;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 265:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 266:
                    switch (yytok) {
                        case ID:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 267:
                    switch (yytok) {
                        case ID:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 268:
                    switch (yytok) {
                        case '[':
                            yyn = 122;
                            continue;
                        case ID:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 269:
                    yyn = yys116();
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 270:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 113;
                            continue;
                        case ID:
                            yyn = 114;
                            continue;
                        case INT:
                            yyn = 115;
                            continue;
                        case '}':
                        case PUBLIC:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 271:
                    switch (yytok) {
                        case '}':
                        case PUBLIC:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 272:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 113;
                            continue;
                        case ID:
                            yyn = 114;
                            continue;
                        case INT:
                            yyn = 115;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 273:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 274:
                    switch (yytok) {
                        case ';':
                            yyn = 125;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 275:
                    switch (yytok) {
                        case ']':
                            yyn = 126;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 276:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 119;
                            continue;
                        case '}':
                            yyn = 127;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 277:
                    switch (yytok) {
                        case ID:
                            yyn = 128;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 278:
                    yyn = yys125();
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 279:
                    switch (yytok) {
                        case ID:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 280:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 281:
                    switch (yytok) {
                        case '(':
                            yyn = 129;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 282:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 113;
                            continue;
                        case ID:
                            yyn = 114;
                            continue;
                        case INT:
                            yyn = 115;
                            continue;
                        case ')':
                            yyn = 132;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 283:
                    switch (yytok) {
                        case ')':
                            yyn = 133;
                            continue;
                        case ',':
                            yyn = 134;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 284:
                    switch (yytok) {
                        case ID:
                            yyn = 135;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 285:
                    switch (yytok) {
                        case '{':
                            yyn = 136;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 286:
                    switch (yytok) {
                        case '{':
                            yyn = 137;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 287:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 113;
                            continue;
                        case ID:
                            yyn = 114;
                            continue;
                        case INT:
                            yyn = 115;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 288:
                    switch (yytok) {
                        case ')':
                        case ',':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 289:
                    yyn = yys136();
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 290:
                    yyn = yys137();
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 291:
                    switch (yytok) {
                        case ID:
                            yyn = 141;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 292:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 293:
                    yyn = yys140();
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 294:
                    switch (yytok) {
                        case ')':
                        case ',':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 295:
                    switch (yytok) {
                        case RETURN:
                            yyn = 145;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 296:
                    switch (yytok) {
                        case '=':
                            yyn = 23;
                            continue;
                        case '[':
                            yyn = 24;
                            continue;
                        case ID:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 297:
                    switch (yytok) {
                        case RETURN:
                            yyn = 146;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 298:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 299:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 300:
                    yyn = yys147();
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 301:
                    yyn = yys148();
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 302:
                    switch (yytok) {
                        case '}':
                            yyn = 151;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 303:
                    switch (yytok) {
                        case '}':
                            yyn = 152;
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 304:
                    switch (yytok) {
                        case '}':
                        case PUBLIC:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 305:
                    switch (yytok) {
                        case '}':
                        case PUBLIC:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 309;
                    continue;

                case 306:
                    return true;
                case 307:
                    yyerror("stack overflow");
                case 308:
                    return false;
                case 309:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys21() {
        switch (yytok) {
            case ID:
                return 17;
            case IF:
                return 18;
            case PRINTLN:
                return 19;
            case WHILE:
                return 20;
            case '{':
                return 21;
            case '}':
                return yyr20();
        }
        return 309;
    }

    private int yys23() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys24() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys25() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys26() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys27() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys28() {
        switch (yytok) {
            case ID:
                return 17;
            case IF:
                return 18;
            case PRINTLN:
                return 19;
            case WHILE:
                return 20;
            case '{':
                return 21;
            case '}':
            case RETURN:
                return yyr20();
        }
        return 309;
    }

    private int yys31() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case ';':
                return 57;
            case '<':
                return 58;
        }
        return 309;
    }

    private int yys32() {
        switch (yytok) {
            case '.':
                return 59;
            case '[':
                return 60;
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr45();
        }
        return 309;
    }

    private int yys33() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr39();
        }
        return 309;
    }

    private int yys34() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case '[':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr46();
        }
        return 309;
    }

    private int yys36() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr41();
        }
        return 309;
    }

    private int yys37() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr40();
        }
        return 309;
    }

    private int yys38() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case '[':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr47();
        }
        return 309;
    }

    private int yys39() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr38();
        }
        return 309;
    }

    private int yys40() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys41() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys42() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys43() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ']':
                return 66;
        }
        return 309;
    }

    private int yys44() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ')':
                return 67;
        }
        return 309;
    }

    private int yys45() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ')':
                return 68;
        }
        return 309;
    }

    private int yys46() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ')':
                return 69;
        }
        return 309;
    }

    private int yys48() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr21();
        }
        return 309;
    }

    private int yys50() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys51() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys52() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys53() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys54() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys55() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys56() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys57() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr25();
        }
        return 309;
    }

    private int yys58() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys60() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys63() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr37();
        }
        return 309;
    }

    private int yys64() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ')':
                return 85;
        }
        return 309;
    }

    private int yys65() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr36();
        }
        return 309;
    }

    private int yys72() {
        switch (yytok) {
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ')':
            case ']':
            case ';':
            case ',':
            case AND:
                return yyr35();
        }
        return 309;
    }

    private int yys73() {
        switch (yytok) {
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case ',':
            case AND:
                return yyr33();
        }
        return 309;
    }

    private int yys74() {
        switch (yytok) {
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case ',':
            case AND:
                return yyr34();
        }
        return 309;
    }

    private int yys75() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr30();
        }
        return 309;
    }

    private int yys76() {
        switch (yytok) {
            case '*':
                return 53;
            case '/':
                return 56;
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr28();
        }
        return 309;
    }

    private int yys77() {
        switch (yytok) {
            case '*':
                return 53;
            case '/':
                return 56;
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr29();
        }
        return 309;
    }

    private int yys78() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr31();
        }
        return 309;
    }

    private int yys79() {
        switch (yytok) {
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case ',':
            case AND:
                return yyr32();
        }
        return 309;
    }

    private int yys80() {
        switch (yytok) {
            case '(':
                return 91;
            case '*':
            case ')':
            case NEQ:
            case ']':
            case '[':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr50();
        }
        return 309;
    }

    private int yys81() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr43();
        }
        return 309;
    }

    private int yys82() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ']':
                return 92;
        }
        return 309;
    }

    private int yys84() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys85() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case '[':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr49();
        }
        return 309;
    }

    private int yys86() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys87() {
        switch (yytok) {
            case ELSE:
                return 96;
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
                return yyr22();
        }
        return 309;
    }

    private int yys88() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr27();
        }
        return 309;
    }

    private int yys89() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr24();
        }
        return 309;
    }

    private int yys91() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
            case ')':
                return 101;
        }
        return 309;
    }

    private int yys92() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr44();
        }
        return 309;
    }

    private int yys93() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case '[':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr48();
        }
        return 309;
    }

    private int yys94() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ']':
                return 102;
        }
        return 309;
    }

    private int yys95() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ';':
                return 103;
        }
        return 309;
    }

    private int yys99() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ')':
            case ',':
                return yyr54();
        }
        return 309;
    }

    private int yys101() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case '[':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr52();
        }
        return 309;
    }

    private int yys102() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr42();
        }
        return 309;
    }

    private int yys103() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr26();
        }
        return 309;
    }

    private int yys104() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr23();
        }
        return 309;
    }

    private int yys107() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQ:
            case ']':
            case '[':
            case EQ:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr51();
        }
        return 309;
    }

    private int yys108() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys112() {
        switch (yytok) {
            case WHILE:
            case '{':
            case RETURN:
            case INT:
            case PUBLIC:
            case PRINTLN:
            case IF:
            case '}':
            case ID:
            case BOOLEAN:
                return yyr6();
        }
        return 309;
    }

    private int yys116() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ')':
            case ',':
                return yyr53();
        }
        return 309;
    }

    private int yys125() {
        switch (yytok) {
            case WHILE:
            case '{':
            case RETURN:
            case INT:
            case PUBLIC:
            case PRINTLN:
            case IF:
            case '}':
            case ID:
            case BOOLEAN:
                return yyr8();
        }
        return 309;
    }

    private int yys136() {
        switch (yytok) {
            case WHILE:
            case '{':
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case ID:
            case BOOLEAN:
                return yyr7();
        }
        return 309;
    }

    private int yys137() {
        switch (yytok) {
            case WHILE:
            case '{':
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case ID:
            case BOOLEAN:
                return yyr7();
        }
        return 309;
    }

    private int yys139() {
        switch (yytok) {
            case IF:
                return 18;
            case PRINTLN:
                return 19;
            case WHILE:
                return 20;
            case '{':
                return 21;
            case BOOLEAN:
                return 113;
            case INT:
                return 115;
            case ID:
                return 143;
            case RETURN:
                return yyr20();
        }
        return 309;
    }

    private int yys140() {
        switch (yytok) {
            case IF:
                return 18;
            case PRINTLN:
                return 19;
            case WHILE:
                return 20;
            case '{':
                return 21;
            case BOOLEAN:
                return 113;
            case INT:
                return 115;
            case ID:
                return 143;
            case RETURN:
                return yyr20();
        }
        return 309;
    }

    private int yys145() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys146() {
        switch (yytok) {
            case FALSE:
                return 33;
            case ID:
                return 34;
            case NEW:
                return 35;
            case NULL:
                return 36;
            case NUM:
                return 37;
            case THIS:
                return 38;
            case TRUE:
                return 39;
            case '!':
                return 40;
            case '(':
                return 41;
            case '-':
                return 42;
        }
        return 309;
    }

    private int yys147() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ';':
                return 149;
        }
        return 309;
    }

    private int yys148() {
        switch (yytok) {
            case AND:
                return 50;
            case EQ:
                return 51;
            case NEQ:
                return 52;
            case '*':
                return 53;
            case '+':
                return 54;
            case '-':
                return 55;
            case '/':
                return 56;
            case '<':
                return 58;
            case ';':
                return 150;
        }
        return 309;
    }

    private int yyr1() { // prog : CLASS ID '{' PUBLIC STATIC VOID MAIN '(' STRING '[' ']' ID ')' '{' cmd '}' '}' classes
        { saida = new Prog(((Token)yysv[yysp-17]).texto, ((Token)yysv[yysp-7]).texto, ((Cmd)yysv[yysp-4]), ((java.util.List)yysv[yysp-1])); yyrv = saida; }
        yysv[yysp-=18] = yyrv;
        return 1;
    }

    private int yyr2() { // classes : classes classe
        { ((java.util.List)yysv[yysp-2]).add(yysv[yysp-1]); yyrv = ((java.util.List)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return 49;
    }

    private int yyr3() { // classes : /* empty */
        { yyrv = new java.util.ArrayList<Classe>(); }
        yysv[yysp-=0] = yyrv;
        return 49;
    }

    private int yyr21() { // cmd : '{' cmds '}'
        { yyrv = new Bloco(((java.util.List)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return yypcmd();
    }

    private int yyr22() { // cmd : IF '(' exp ')' cmd
        { yyrv = new If(((Exp)yysv[yysp-3]), ((Cmd)yysv[yysp-1]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=5] = yyrv;
        return yypcmd();
    }

    private int yyr23() { // cmd : IF '(' exp ')' cmd ELSE cmd
        { yyrv = new If(((Exp)yysv[yysp-5]), ((Cmd)yysv[yysp-3]), ((Cmd)yysv[yysp-1]), ((Token)yysv[yysp-7]).lin); }
        yysv[yysp-=7] = yyrv;
        return yypcmd();
    }

    private int yyr24() { // cmd : WHILE '(' exp ')' cmd
        { yyrv = new While(((Exp)yysv[yysp-3]), ((Cmd)yysv[yysp-1]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=5] = yyrv;
        return yypcmd();
    }

    private int yyr25() { // cmd : ID '=' exp ';'
        { yyrv = new Atrib(((Token)yysv[yysp-4]).texto, ((Exp)yysv[yysp-2]), ((Token)yysv[yysp-3]).lin); }
        yysv[yysp-=4] = yyrv;
        return yypcmd();
    }

    private int yyr26() { // cmd : ID '[' exp ']' '=' exp ';'
        { yyrv = new AtribVetor(((Token)yysv[yysp-7]).texto, ((Exp)yysv[yysp-5]), ((Exp)yysv[yysp-2]), ((Token)yysv[yysp-3]).lin); }
        yysv[yysp-=7] = yyrv;
        return yypcmd();
    }

    private int yyr27() { // cmd : PRINTLN '(' exp ')' ';'
        { yyrv = new Println(((Exp)yysv[yysp-3]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=5] = yyrv;
        return yypcmd();
    }

    private int yypcmd() {
        switch (yyst[yysp-1]) {
            case 96: return 104;
            case 69: return 89;
            case 67: return 87;
            case 15: return 16;
            default: return 28;
        }
    }

    private int yyr19() { // cmds : cmd cmds
        { ((java.util.List)yysv[yysp-1]).add(0, ((Cmd)yysv[yysp-2])); yyrv = ((java.util.List)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        return yypcmds();
    }

    private int yyr20() { // cmds : /* empty */
        { yyrv = new java.util.ArrayList<Cmd>(); }
        yysv[yysp-=0] = yyrv;
        return yypcmds();
    }

    private int yypcmds() {
        switch (yyst[yysp-1]) {
            case 139: return 142;
            case 28: return 47;
            case 21: return 29;
            default: return 144;
        }
    }

    private int yyr28() { // exp : exp '+' exp
        { yyrv = new Soma(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr29() { // exp : exp '-' exp
        { yyrv = new Sub(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr30() { // exp : exp '*' exp
        { yyrv = new Mult(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr31() { // exp : exp '/' exp
        { yyrv = new Div(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr32() { // exp : exp '<' exp
        { yyrv = new Menor(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr33() { // exp : exp EQ exp
        { yyrv = new Igual(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr34() { // exp : exp NEQ exp
        { yyrv = new Dif(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr35() { // exp : exp AND exp
        { yyrv = new ELog(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr36() { // exp : '-' exp
        { yyrv = new Neg(((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=2] = yyrv;
        return yypexp();
    }

    private int yyr37() { // exp : '!' exp
        { yyrv = new Nao(((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=2] = yyrv;
        return yypexp();
    }

    private int yyr38() { // exp : TRUE
        { yyrv = new True(); }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr39() { // exp : FALSE
        { yyrv = new False(); }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr40() { // exp : NUM
        { yyrv = new Num(((Token)yysv[yysp-1]).texto); }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr41() { // exp : NULL
        { yyrv = new Null(); }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr42() { // exp : NEW INT '[' exp ']'
        { yyrv = new Vetor(((Exp)yysv[yysp-2]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=5] = yyrv;
        return yypexp();
    }

    private int yyr43() { // exp : pexp '.' LENGTH
        { yyrv = new Length(((Exp)yysv[yysp-3]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr44() { // exp : pexp '[' exp ']'
        { yyrv = new Indexa(((Exp)yysv[yysp-4]), ((Exp)yysv[yysp-2]), ((Token)yysv[yysp-3]).lin); }
        yysv[yysp-=4] = yyrv;
        return yypexp();
    }

    private int yyr45() { // exp : pexp
        yysp -= 1;
        return yypexp();
    }

    private int yypexp() {
        switch (yyst[yysp-1]) {
            case 145: return 147;
            case 108: return 116;
            case 91: return 99;
            case 86: return 95;
            case 84: return 94;
            case 60: return 82;
            case 58: return 79;
            case 56: return 78;
            case 55: return 77;
            case 54: return 76;
            case 53: return 75;
            case 52: return 74;
            case 51: return 73;
            case 50: return 72;
            case 42: return 65;
            case 41: return 64;
            case 40: return 63;
            case 27: return 46;
            case 26: return 45;
            case 25: return 44;
            case 24: return 43;
            case 23: return 31;
            default: return 148;
        }
    }

    private int yyr53() { // exps : exps ',' exp
        { ((java.util.List)yysv[yysp-3]).add(((Exp)yysv[yysp-1])); yyrv = ((java.util.List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return 100;
    }

    private int yyr54() { // exps : exp
        { java.util.List<Exp> l = new java.util.ArrayList<Exp>();
                        l.add(((Exp)yysv[yysp-1])); yyrv = l; }
        yysv[yysp-=1] = yyrv;
        return 100;
    }

    private int yyr11() { // metodo : PUBLIC tipo ID '(' ')' '{' vars cmds RETURN exp ';' '}'
        { yyrv = new Metodo(((String)yysv[yysp-11]), ((Token)yysv[yysp-10]).texto, new java.util.ArrayList<Var>(), ((java.util.List)yysv[yysp-6]), ((java.util.List)yysv[yysp-5]), ((Exp)yysv[yysp-3]), ((Token)yysv[yysp-10]).lin); }
        yysv[yysp-=12] = yyrv;
        return 118;
    }

    private int yyr12() { // metodo : PUBLIC tipo ID '(' params ')' '{' vars cmds RETURN exp ';' '}'
        { yyrv = new Metodo(((String)yysv[yysp-12]), ((Token)yysv[yysp-11]).texto, ((java.util.List)yysv[yysp-9]), ((java.util.List)yysv[yysp-6]), ((java.util.List)yysv[yysp-5]), ((Exp)yysv[yysp-3]), ((Token)yysv[yysp-11]).lin); }
        yysv[yysp-=13] = yyrv;
        return 118;
    }

    private int yyr9() { // metodos : metodos metodo
        { ((java.util.List)yysv[yysp-2]).add(yysv[yysp-1]); yyrv = ((java.util.List)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypmetodos();
    }

    private int yyr10() { // metodos : /* empty */
        { yyrv = new java.util.ArrayList<Metodo>(); }
        yysv[yysp-=0] = yyrv;
        return yypmetodos();
    }

    private int yypmetodos() {
        switch (yyst[yysp-1]) {
            case 106: return 110;
            default: return 123;
        }
    }

    private int yyr13() { // params : params ',' tipo ID
        { ((java.util.List)yysv[yysp-4]).add(new Var(((String)yysv[yysp-2]), ((Token)yysv[yysp-1]).texto, ((Token)yysv[yysp-1]).lin)); yyrv = ((java.util.List)yysv[yysp-4]); }
        yysv[yysp-=4] = yyrv;
        return 130;
    }

    private int yyr14() { // params : tipo ID
        { java.util.List<Var> l = new java.util.ArrayList<Var>();
                                l.add(new Var(((String)yysv[yysp-2]), ((Token)yysv[yysp-1]).texto, ((Token)yysv[yysp-1]).lin)); yyrv = l; }
        yysv[yysp-=2] = yyrv;
        return 130;
    }

    private int yyr46() { // pexp : ID
        { yyrv = new Id(((Token)yysv[yysp-1]).texto, ((Token)yysv[yysp-1]).lin); }
        yysv[yysp-=1] = yyrv;
        return 32;
    }

    private int yyr47() { // pexp : THIS
        { yyrv = new This(((Token)yysv[yysp-1]).lin); }
        yysv[yysp-=1] = yyrv;
        return 32;
    }

    private int yyr48() { // pexp : NEW ID '(' ')'
        { yyrv = new New(((Token)yysv[yysp-3]).texto, ((Token)yysv[yysp-4]).lin); }
        yysv[yysp-=4] = yyrv;
        return 32;
    }

    private int yyr49() { // pexp : '(' exp ')'
        { yyrv = ((Exp)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return 32;
    }

    private int yyr50() { // pexp : pexp '.' ID
        { yyrv = new Campo(((Exp)yysv[yysp-3]), ((Token)yysv[yysp-1]).texto, ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return 32;
    }

    private int yyr51() { // pexp : pexp '.' ID '(' exps ')'
        { yyrv = new Chamada(((Exp)yysv[yysp-6]), ((Token)yysv[yysp-4]).texto, ((java.util.List)yysv[yysp-2]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=6] = yyrv;
        return 32;
    }

    private int yyr52() { // pexp : pexp '.' ID '(' ')'
        { yyrv = new Chamada(((Exp)yysv[yysp-5]), ((Token)yysv[yysp-3]).texto, new java.util.ArrayList<Exp>(), ((Token)yysv[yysp-4]).lin); }
        yysv[yysp-=5] = yyrv;
        return 32;
    }

    private int yyr4() { // classe : CLASS ID '{' vars metodos '}'
        { yyrv = new Classe(((Token)yysv[yysp-5]).texto, ((java.util.List)yysv[yysp-3]), ((java.util.List)yysv[yysp-2]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=6] = yyrv;
        return 70;
    }

    private int yyr5() { // classe : CLASS ID EXTENDS ID '{' vars metodos '}'
        { yyrv = new Classe(((Token)yysv[yysp-7]).texto, ((Token)yysv[yysp-5]).texto, ((java.util.List)yysv[yysp-3]), ((java.util.List)yysv[yysp-2]), ((Token)yysv[yysp-7]).lin); }
        yysv[yysp-=8] = yyrv;
        return 70;
    }

    private int yyr15() { // tipo : INT '[' ']'
        { yyrv = "int[]"; }
        yysv[yysp-=3] = yyrv;
        return yyptipo();
    }

    private int yyr16() { // tipo : BOOLEAN
        { yyrv = "boolean"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr17() { // tipo : INT
        { yyrv = "int"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr18() { // tipo : ID
        { yyrv = ((Token)yysv[yysp-1]).texto; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyptipo() {
        switch (yyst[yysp-1]) {
            case 134: return 138;
            case 129: return 131;
            case 119: return 124;
            default: return 111;
        }
    }

    private int yyr8() { // var : tipo ID ';'
        { yyrv = new Var(((String)yysv[yysp-3]), ((Token)yysv[yysp-2]).texto, ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return 112;
    }

    private int yyr6() { // vars : vars var
        { ((java.util.List)yysv[yysp-2]).add(((Var)yysv[yysp-1])); yyrv = ((java.util.List)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypvars();
    }

    private int yyr7() { // vars : /* empty */
        { yyrv = new java.util.ArrayList<Var>(); }
        yysv[yysp-=0] = yyrv;
        return yypvars();
    }

    private int yypvars() {
        switch (yyst[yysp-1]) {
            case 136: return 139;
            case 109: return 117;
            case 98: return 106;
            default: return 140;
        }
    }

    protected String[] yyerrmsgs = {
    };


Scanner scan;

Token token;  // lookahead
int tipo;     // tipo do lookahead

public Prog saida; // workaround pro bug do tipo do parse()

public Parser(java.io.Reader entrada) {
  scan = new Scanner(entrada);
  proximo(); // inicializa o lookahead
}

int proximo() {
  try {
    token = scan.nextToken();
    tipo = token.tipo;
    return tipo;
  } catch(java.io.IOException e) {
    throw new RuntimeException(e);
  }
}

void yyerror(String msg) {
  throw new RuntimeException("erro de sintaxe na linha: " + token.lin);
}

}
