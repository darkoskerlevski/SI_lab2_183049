# Втора лабораториска вежба по Софтверско инженерство

## Дарко Скерлевски, бр. на индекс 183049

### Група на код: 

Ја добив групата на код 3

### Control Flow Graph

![control flow graph](controlflowgraph.png)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10.

### Тест случаи според критериумот Multiple condition

Според Multiple condition критериумот треба да се разгледаат сите јазли кои имаат повеќе од еден услов. Во нашиот случај има два јазли со повеќе од еден услови и тоа:

Во првиот јазол се проверува дали функциите getUsername() и getPassword() враќаат null. Бидејќи се два услови има вкупно можни три комбинации. Првата е доколку и двете функции вратат null. Само во тој случај гранката ќе продолжи на јазолот F. Втората комбинација е доколку се исполни првиот услов и притоа дали вториот услов е исполот или не, не е важно и се нарекува мрзлива евалуација и се означува со X. Третата комбинација е доколку првиот услов не е исполнет но вториот е исполнет. Во тој случај гранката ќе продолжи на јазолот E како и претходната комбинација на тестирање.

if ( user.getUsername()==null || user.getPassword()==null )

| Combination | Possible Test Case | Branch |
| :---------: | :----------------: | :----: |
| FF          | Darko, finki8generacija | ABD-F  |
| TX	      | null, finki8generacija  | ABD-E  |
| FT	      | Darko, null | ABD-E |

Вториот јазол кој го тестираме има три услови па затоа има четири можни комбинации. Првата е доколку првиот услов е исполнет, останатите два услови се обележуваат со X и гранката би продолжила на јазолот X. Втората комбинација е доколку првиот услов не е исполнет, вториот исполнет и третиот обележан со X. Гранката повторно ќе продолжи на јазолот X бидејќи условот ќе биде исполнет. Третата комбинација е првита два услови да се исполнети додека последниот да не е. Гранката повторно ќе продолжи на јазолот X бидејќи условот ќе биде исполнет. Во последната комбинација каде сите три услови се неисполнети гранката би пролжила на јазолот Y. 

if ( !digit || !upper || !special )

| Combination | Possible Test Case | Branch |
| :---------: | :----------------: | :----: |
| TXX         | true, true, true | W-X  |
| FTX         | false, true, true | W-X  |
| FFT         | false, false, true | W-X |
| FFF         | false, false, false | W-Y |


### Тест случаи според критериумот Every path

Според Every path критериумот вкупно има можно 12 тест случаи и тоа се следните:

| Test case | Possible Test Case | Path |
| :---------: | :----------------: | :----: |
| 1			| user = null		   | A,B,C,Z |
| 2			| user.getUsername() = null	| A,B,D,E,Z |
| 3			| user.getUsername() = Darko && user.getPassword() = darkofinki	| A,B,D,F,G,H,I,Z |
| 4			| user.getUsername() = Darko && user.getPassword() = finki | A,B,C,D,F,G,H,J,K,Z |
| 5			| user.getUsername() = Darko && user.getPassword() = finkiosmageneracija | A,B,C,D,F,G,H,J,L,M,N,O,(Q,S,U,P,O)-19,W,X,Z |
| 6			| user.getUsername() = Darko && user.getPassword() = finki8generacija | A,B,C,D,F,G,H,J,L,M,N,O,(Q,S,U,P,O)-5,(Q,R,S,U,P,O)-1,(Q,S,U,P,O)-10,W,X,Z |
| 7			| user.getUsername() = Darko && user.getPassword() = Finkiosmageneracija | A,B,C,D,F,G,H,J,L,M,N,O,(Q,S,T,U,P,O)-1,(Q,S,U,P,O)-18,W,X,Z |
| 8			| user.getUsername() = Darko && user.getPassword() = finkiosmageneracij@ | A,B,C,D,F,G,H,J,L,M,N,O,(Q,S,U,P,O)-18,(Q,S,U,V,P,O)-1,W,X,Z |
| 9			| user.getUsername() = Darko && user.getPassword() = Finki8generacija | A,B,C,D,F,G,H,J,L,M,N,O,(Q,S,T,U,P,O)-1,(Q,S,U,P,O)-4,(Q,R,S,U,P,O)-1,(Q,S,U,P,O)-10,W,X,Z |
| 10		| user.getUsername() = Darko && user.getPassword() = finki8generacij@ | A,B,C,D,F,G,H,J,L,M,N,O,(Q,S,U,P,O)-5,(Q,R,S,U,P,O)-1,(Q,S,U,P,O)-9,(Q,S,U,V,P,O)-1,W,X,Z |
| 11		| user.getUsername() = Darko && user.getPassword() = Finkiosmageneracij@ | A,B,C,D,F,G,H,J,L,M,N,O,(Q,S,T,U,P,O)-1,(Q,S,U,P,O)-17,(Q,S,U,V,P,O)-1,W,X,Z |
| 12		| user.getUsername() = Darko && user.getPassword() = Finki8generacij@ | A,B,C,D,F,G,H,J,L,M,N,O,(Q,S,T,U,P,O)-1,(Q,S,U,P,O)-4,(Q,R,S,U,P,O)-1,(Q,S,U,P,O)-9,(Q,S,U,V,P,O)-1,W,Y,Z |

Јазлите кои се ставени во загради проследени со црта(-) и број се во циклус каде што бројот означува колку пати се повторува циклусот. За пример го зимаме 2-риот тест случај каде се поминува патеката A,B,D,E,Z и така со секој тест случај се поминува различна патека и со 12-те се изминуваат сите можни комбинации на патеки.