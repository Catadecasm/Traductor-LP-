grammar Latino;

// Tokens
SI: 'si' ;
ENTONCES: 'entonces';
SINO: 'sino';
FIN: 'fin';
REGEX: '~=' ;
ELEGIR: 'elegir';
CASO: 'caso';
DEFECTO: 'defecto';
OTRO: 'otro';
ROMPER: 'romper';
DESDE: 'desde';
MIENTRAS: 'mientras';
PARA: 'para';
EN: 'en';
RANGO: 'rango';
REPETIR: 'repetir';
HASTA: 'hasta';
INCLUIR: 'incluir';
RETORNAR: 'retornar';
ACADENA: 'acadena';
ALOGICO: 'alogico';
ANUMERO: 'anumero';

// Identificadores y literales
IDENTIFICADOR: [a-zA-Z_][a-zA-Z_0-9]* | [\u00C0-\u017F]+ ;
ENTERO: [0-9]+ ;
REAL: [0-9]+ '.' [0-9]+ ;
CADENA: '"' .*? '"' | '\'' .*? '\'' ;
BOOLEANO: 'Verdadero' | 'Falso' ;
NULO: 'nulo' ;

// Operadores y delimitadores
CONCATENACION: '..';
MAS: '+' ;
MENOS: '-' ;
POR: '*' ;
DIVIDIR: '/' ;
MODULO: '%' ;
POTENCIA: '^' ;
IGUAL: '=' ;
MAS_IGUAL: '+=' ;
MENOS_IGUAL: '-=' ;
POR_IGUAL: '*=' ;
DIVIDIR_IGUAL: '/=' ;
MODULO_IGUAL: '%=' ;
Y: 'y' ;
O: 'o' ;
IGUALDAD: '==' ;
DIFERENTE: '!=' ;
MENOR: '<' ;
MENOR_IGUAL: '<=' ;
MAYOR: '>' ;
MAYOR_IGUAL: '>=' ;
PUNTO_Y_COMA: ';' ;
DOS_PUNTOS: ':' ;
COMA: ',' ;
PARENIZQ: '(' ;
PARENDER: ')' ;
LLAVEIZQ: '{' ;
LLAVEDER: '}' ;
CORCHETEIZQ: '[' ;
CORCHETEDER: ']' ;
PUNTO: '.' ;

// Espacios en blanco y comentarios
ESPACIOS: [ \t\r\n]+ -> skip ;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip ;
COMENTARIO_LINEA: ('#' | '//') ~[\r\n]* -> skip ;

// Reglas Sintácticas
programa: (declaracion | instruccion | comentario)* EOF ;

declaracion
    : variable_declaracion
    | funcion_declaracion
    | estructura_control
    | entrada_salida
    | excepcion
    | modulo
    ;

variable_declaracion
    : IDENTIFICADOR IGUAL expresion
    ;

instruccion
    : asignacion
    | llamada_funcion
    | retorno
    | romper
    | continuar
    | desde_estructura
    | while_estructura
    | for_rango_estructura
    | repetir_estructura
    | estructura_control
    ;

asignacion
    : IDENTIFICADOR (IGUAL | MAS_IGUAL | MENOS_IGUAL | POR_IGUAL | DIVIDIR_IGUAL | MODULO_IGUAL) expresion
    ;

tipo_dato
    : ENTERO_TIPO
    | REAL_TIPO
    | CADENA_TIPO
    | BOOLEANO_TIPO
    ;

expresion
    : literal
    | llamada_funcion
    | llamada_metodo
    | lista
    | diccionario
    | acceso_lista
    | acceso_miembro
    | PARENIZQ expresion PARENDER
    | IDENTIFICADOR
    | acadena_funcion
    | alogico_funcion
    | anumero_funcion
    | expresion bin_op expresion
    | expresion CONCATENACION expresion
    ;

acadena_funcion
    : ACADENA PARENIZQ expresion PARENDER
    ;

alogico_funcion
    : ALOGICO PARENIZQ expresion PARENDER
    ;

anumero_funcion
    : ANUMERO PARENIZQ expresion PARENDER
    ;

literal
    : ENTERO
    | REAL
    | CADENA
    | BOOLEANO
    | NULO
    ;

lista
    : CORCHETEIZQ (expresion (COMA expresion)*)? CORCHETEDER
    ;

diccionario
    : LLAVEIZQ (entrada_diccionario (COMA entrada_diccionario)*)? LLAVEDER
    ;

entrada_diccionario
    : CADENA DOS_PUNTOS expresion
    ;

acceso_lista
    : IDENTIFICADOR CORCHETEIZQ expresion CORCHETEDER
    ;

acceso_miembro
    : primario (PUNTO IDENTIFICADOR)*
    ;

primario
    : IDENTIFICADOR
    | llamada_funcion
    | llamada_metodo
    | lista
    | diccionario
    | acceso_lista
    | PARENIZQ expresion PARENDER
    ;

bin_op
    : MAS
    | MENOS
    | POR
    | DIVIDIR
    | MODULO
    | POTENCIA
    | Y
    | O
    | IGUALDAD
    | DIFERENTE
    | MENOR
    | MENOR_IGUAL
    | MAYOR
    | MAYOR_IGUAL
    | REGEX
    ;

// Estructuras de control
estructura_control
    : if_estructura
    | for_estructura
    | while_estructura
    | switch_estructura
    | desde_estructura
    | for_rango_estructura
    | repetir_estructura
    ;

if_estructura
    : SI expresion ENTONCES bloque (SINO bloque)? FIN
    ;

for_estructura
    : PARA IDENTIFICADOR IGUAL expresion HASTA expresion (CON INCREMENTO expresion)? bloque FIN
    ;

while_estructura
    : MIENTRAS expresion bloque FIN
    ;

switch_estructura
    : ELEGIR PARENIZQ expresion PARENDER bloque_casos FIN
    ;

bloque_casos
    : (caso | defecto | otro)*
    ;

caso
    : CASO literal DOS_PUNTOS bloque
    ;

defecto
    : DEFECTO DOS_PUNTOS bloque
    ;

otro
    : OTRO DOS_PUNTOS bloque
    ;

desde_estructura
    : DESDE PARENIZQ asignacion PUNTO_Y_COMA expresion PUNTO_Y_COMA incremento_decremento PARENDER bloque FIN
    ;

for_rango_estructura
    : PARA IDENTIFICADOR EN RANGO PARENIZQ argumentos_rango PARENDER bloque FIN
    ;

repetir_estructura
    : REPETIR bloque HASTA expresion FIN
    ;

argumentos_rango
    : expresion (COMA expresion (COMA expresion)?)?
    ;

instruccion_simple
    : asignacion
    | incremento_decremento
    ;

incremento_decremento
    : IDENTIFICADOR (MAS MAS | MENOS MENOS)
    ;

bloque
    : (declaracion | instruccion | comentario)*
    ;

// Funciones
funcion_declaracion
    : FUNCION IDENTIFICADOR PARENIZQ parametros? PARENDER bloque FIN
    ;

parametros
    : parametro (COMA parametro)*
    ;

parametro
    : IDENTIFICADOR DOS_PUNTOS tipo_dato
    ;

llamada_funcion
    : IDENTIFICADOR PARENIZQ argumentos? PARENDER
    ;

llamada_metodo
    : IDENTIFICADOR PUNTO IDENTIFICADOR PARENIZQ argumentos? PARENDER
    ;

argumentos
    : expresion (COMA expresion)*
    ;

retorno
    : RETORNO expresion?
    ;

romper
    : ROMPER
    ;

continuar
    : CONTINUAR
    ;

// Entrada y salida
entrada_salida
    : LEER PARENIZQ PARENDER
    | IMPRIMIR PARENIZQ argumentos? PARENDER
    ;

// Excepciones
excepcion
    : TRY bloque EXCEPT IDENTIFICADOR DOS_PUNTOS bloque FIN
    ;

// Módulos y paquetes
modulo
    : INCLUIR PARENIZQ CADENA PARENDER
    | RETORNAR diccionario
    ;

fin_de_bloque
    : FIN
    ;

// Comentarios
comentario
    : COMENTARIO_LINEA
    | COMENTARIO_BLOQUE
    ;

// Palabras reservadas
VAR: 'var' ;
ENTERO_TIPO: 'entero' ;
REAL_TIPO: 'real' ;
CADENA_TIPO: 'cadena' ;
BOOLEANO_TIPO: 'booleano' ;
FUNCION: 'funcion' ;
LEER: 'leer' ;
IMPRIMIR: 'imprimir' ;
TRY: 'try' ;
EXCEPT: 'except' ;
IMPORTAR: 'importar' ;
RETORNO: 'retorno' ;
CONTINUAR: 'continuar' ;
VERDADERO: 'Verdadero' ;
FALSO: 'Falso' ;
