/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar BBRLexer;

START_PBP   :   '<table class="no_highlight stats_table">' -> 
                        pushMode(PBP), skip ;
TAG         :   '<' .*? '>' -> skip ;
JUNK_TEXT   :   ~[<]+ -> skip ;

mode PBP;

END_PBP     :   '</table>' -> skip, popMode;
TAG_ALT     :   '<' .*? '>' -> skip ;
TEXT        :   ~[<]+ ;
