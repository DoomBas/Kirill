import re
test = []
test.append('А ты знал, что ВТ - лучший факультет в ИТМО?')
test.append('ВТИТМО ВТ ПЛОХой абоба ввввв ИТМО молния')
test.append('ВТ ВТ ВТ ВТ ИТМО ИТМО ИТМО ИТМО ИТМО')
test.append('prepodi ВТ rabotaют в vyse ИТМО')
test.append('ВТ НЕ АБОБА КРУТОЙ ТАК СЕБЕ ХЗ ИТМО')
regul = r'ВТ(\W+\w+){0,4}\W+ИТМО'
for i in test:
    if re.search(regul, i)==None:
        print("Совпадений не найдено")
    else:
        print(re.search(regul, i)[0])

