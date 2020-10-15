import sys

for line in sys.stdin:
    if 'Exit' == line.rstrip():
        break;
    print('Como te llamas?')
    print(f'Hola {line}');
print('done');