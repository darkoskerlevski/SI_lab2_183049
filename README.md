# Втора лабораториска вежба по Софтверско инженерство

## Дарко Скерлевски, бр. на индекс 183049

### Група на код: 

Ја добив групата на код 3

### Control Flow Graph

![control flow graph](controlflowgraph.png)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10.

### Тест случаи според критериумот Multiple condition

if (user.getUsername()==null || user.getPassword()==null)

| Combination | Possible Test Case | Branch |
| :---------: | :----------------: | :----: |
| FF          | null, null	   | ABD-E  |
| TX	      | Darko, null	   | ABD-F  |
| FT	      | null, finki8generacija| ABD-F |

if (!digit || !upper || !special)

| Combination | Possible Test Case | Branch |
| :---------: | :----------------: | :----: |
| TXX         | true, true, true | W-X  |
| FTX         | false, true, true | W-X  |
| FFT         | false, false, true | W-X |
| FFF         | false, false, false | W-Y |
