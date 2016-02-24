grammar ExprInterp;

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}

prog:   stat+ ;
                
stat:   expr NEWLINE {System.out.println($expr.value);}
    |   ID '=' expr NEWLINE
        {memory.put($ID.text, new Double($expr.value));}
    |   NEWLINE
    ;
maxF returns [double value]
    :	MAXI LEFTP e=expr ',' p=expr RIGHTP {$value = Math.max($e.value,$p.value);}
    ;
    
expr returns [double value]
    :   e=multExpr {$value = $e.value;}
        (   '+' e=multExpr {$value += $e.value;}
        |   '-' e=multExpr {$value -= $e.value;}
        )*
    | 	e = maxF {$value = $e.value;}
    ;

multExpr returns [double value]
    :   e=atom {$value = $e.value;} ('*' e=atom {$value *= $e.value;})*
    ; 

atom returns [double value]
    :   REL {$value = Double.parseDouble($REL.text);}
    |	INT {$value = Double.parseDouble($INT.text);}
    |   ID
        {
        Double v = (Double)memory.get($ID.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    |	LEFTP expr RIGHTP
    ;

MAXI:	'max';
LEFTP:	'(';
RIGHTP:	')';
ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   ('0'..'9')+;
REL :	(INT '.'INT | INT);
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;
