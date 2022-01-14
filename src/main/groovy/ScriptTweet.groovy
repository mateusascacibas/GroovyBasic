Tweet t1 = new Tweet(20, 'Mateus')
Tweet t2 = new Tweet(12, 'Gabriel')
Tweet t3 = new Tweet(23, 'Dayelle')
Tweet t4 = new Tweet(10, 'Anna')

List listNames = [t1.toString(),t2.toString(),t3.toString(),t4.toString()]
for(i = 0; i < 4; i++){
    print(listNames[i] + "\n")
}