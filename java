
// //a misal
// var a = 729;
// var b = -5126;
// var c = -629;
// var d = 5126

const { toNamespacedPath } = require('path');
const { workerData } = require('worker_threads');

 

// var z = a+b+c+d
// console.log(z)

// //b misal
// var k = -638 +(-173)+ 538 + 173
// console.log(k)

// //c misal
//  var f = (-372) + 984 + 172 + (-2084)
//  console.log(f)

//  // ci misal
//  var g = -78 + 36 + 19 + (-22) + (-25)
//  console.log(g)

//  // d misal
//  var r = 125;
//  var t = -25;
//  var p = 100;
//  var j = (-2)

//  var l = r%t+p*j
//  console.log(l)

//  // e misal
//  var x = 725;
//  var y = -5;
//  var b = 42;
//  var m = -21;
//  var v = x/y-b/m
//  console.log(v)

//  //' misal
//  var h = 1200 / (-60) - 64 / (-8)
//  console.log(h);

// // 162ci misal

// //  a  )))
// var b = 9;
// var y = 8;
// var a = 4;
// var b = 7;
// var x = 5

// var h = 2+ (b-4)
// console.log(h)

// // b  ))))
// var w = - (3 - y) + 7
// console.log(w)

// // c )))
// var u = (3 + y) - 42
// console.log(u)

// // d ))
// var t = 2 *( x + y ) - 2*x
// console.log(t);

// // ci ))
// var z = (x - 5) + (x + 7)
// console.log(z);

// // e ))
// var g = 4 * (a - 2*b) + 8 * b 
// console.log(g);


// +    

    // readline.question(, yash => {
    //     if(yash>18){
    //         console.log("yasin 18den boyukdur")
    //     }else if(yash==18){
    //         console.log("18e beraberdi");
    //     }
    //     else{
    //         console.log("yasin 18den kicikdir")
    //     }
    //     readline.close()
    // });
    



    //    1ci
    // for(i=0;i<100;i++){
        
    //     if(i=0 && i<100){
    //         console.log("sayi 0 ile 100 arasinda");
    //     }else{
    //         console.log("sayi 0 ile 100 arasinda degil");
    //     }
    // }   



    // for(i=0;i<)

    // //   2ci
    // if(i%2==0){
    //     console.log("cift");
    // }else{
    //     console.log("tek");
    // }


   

    // //    3cu
    // readline.question('How old are you? What is your name?', yash => {
    //     if(yash>18){
    //         console.log("Bu siteye erisim iznini var")
    //     }else if(yash==18){
    //         console.log("18e beraberdi");
    //     }
    //     else{
    //         console.log("Bu siteye erisim izniniz yok")
    //     }
    //     readline.close()
    // });



    // //5ci
    //  for(i=0;i<100;i++){
    //     if(90<i<100){
    //         console.log("AA");
    //     }else if(80<i<89){
    //         console.log("BA");
    //     }else if(70<i<79){
    //         console.log("BB");
    //     }else if(60<i<69){
    //         console.log("CB");
    //     }else if(50<i<59){
    //         console.log("CC");
    //     }else if(40<i<49){
    //         console.log("DC");
    //     }else if(30<i<39){
    //         console.log("DD");
    //     }else if(0<i<29){
    //         console.log("FF");
    //     }
    //  }


    // let a = number ;
    // b = 1;
    // c=1


    // while(b<=a){
    //     c*=b
    //     b++
    //     console.log(c);
    // }



    // const readline = require('readline').createInterface({
    //     input: process.stdin,
    //     output: process.stdout
    // });
    
    // readline.question('Reqem Daxil Et\n', reqem => {
    
    
    //    readline.close();
    // });






    //Object
// const car = {
//     name:'Volvo',
//     model:'fx40',
//     color:'White',
//     baner:'coupe',
//     teker:{
//         bold:false,
//         inc:17
//     }
// }

// const car2 = {
//     name:'Mercedes',
//     model:'c63',
//     color:'black',
//     baner:'coupe',
//     teker:{
//         bold:false,
//         inc:17
//     }
// }


// const man = {
//     ad:'Azer',
//     soyad:'Dunyamliyev',
//     yas:17
// }

// console.log(car2.name);
// console.log(car2['name']);


// console.log(man.ad);
// console.log(man['ad']);

// // Array

// // Yazilish Usuludur
// const mans = [];

// const numbers = new Array(42323,3423,312);


// // Lenght ve Index Ferqi
// const cars = ['Volvo','Bmw'];

// // Lenght
// console.log(cars.length);

// // Index
// console.log(cars[0]);


// const cars2 = ['Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw','Volvo','Bmw'];

// console.log(cars2[cars2.length-1]);

// console.log(cars[2]);



// const arr = [1,2,3,4,5,4,5,6,7,8];

// console.log(arr[arr.length-1]);

// console.log(arr.length);

// arr[arr.length] = 2;

// let pets = [1,2,3,4,5,6,67,7,7,7];



// const readline = require('readline').createInterface({
//     input: process.stdin,
//     output: process.stdout
// });
  
// readline.question('Reqem Daxil Et\n', reqem => {

//     reqem = Number(reqem);

//     let count = 0;

//     let arr = [1,2];
    
//     while (count !== reqem) {
    
//         count++;

//         arr.push(count)

//         arr[arr.length] = count;

//     }

//     console.log(arr);

//     readline.close();
// });


// let counts = [1,2,3];

// console.log(counts.length);

// console.log(counts.length-1);

// counts[counts.length] = 5;


// console.log(counts.length);

// counts[counts.length] = 5;


// counts[counts.length] = 5;


// counts[counts.length] = 5;

// console.log(counts);



// let shagirdler = ['Azer','Yashar','Cabir','Laman'];

// let count=0;

// // while (count !== shagirdler.length) {

// //     console.log(shagirdler[count]);

// //     count++;

// // }

// shagirdler.forEach((index,telebe)=>{
//     console.log(`${index}-${telebe}`);
// });






// let a = 4 ;
//     b = 1;
//     c=1


// while(b<=a){
//     c*=b
//     b++
//     console.log(c);
// }



// const readline = require('readline').createInterface({
//     input: process.stdin,
//     output: process.stdout
// });
 
// readline.question('Reqem Daxil Et\n', reqem => {
   
//     let count = 1;

//     while (reqem>0) {

//         count *= reqem;
//         reqem--;
    
//     }

//     console.log(count);

//     readline.close();
// });


// const readline = require('readline').createInterface({
//     input: process.stdin,
//     output: process.stdout
// });

// readline.question('Reqem Daxil Et\n', reqem => {

//     reqem = Number(reqem);

//     let count = 1;

//     let index = 1;

//     while (index !== reqem) {

//         index++

//         count *= index;

//     }

//     console.log(count);


//    readline.close();
// });


//     // examsss

// //1ci mesele---Verilmiş bir string, örnək olaraq "Vusal", və axtarılan simvol dəyəri seçilir, məsələn, 'V'. Verilmiş string-in daxilində axtarılan simvol varsa "true", yoxsa "false" qiymətini qaytarın.


// const readline = require('readline').createInterface({
//     input: process.stdin,
//     output: process.stdout
// });

// readline.question('Reqem Daxil Et\n', word => {

//     let word = []


//     if(isNaN(word[])){
//         console.log("true")
//     }else{
//         console.log("false");
//     }
//    readline.close();
// });



// //2-ci mesele --- Vurma cədvəli yazın və konsola 1-dən 10-a qədər olan rəqəmlərin vurma cədvəlini göstərin.


// const readline = require('readline').createInterface({
//     input: process.stdin,
//     output: process.stdout
// });

// readline.question('Reqem Daxil Et\n', b => {

//     let b = 1;
//     let a = 10
//     while(z<=10){
       
//         b++
//         b*=a
//         console.log(b);

//     }
 
//    readline.close();
// });



//3-cu mesele --- Bir rəqəm verilir, məsələn, 435, bu rəqəmin rəqəmlərinin cəmini tapın. İstənilən sayda rəqəm daxil edilə bilər, yəni məsələn, 4 rəqəmli də ola bilər.


// let sum = 0;
// let i = 0;
// while(i<=number){
//     sum+=i
//     i++
// }
// console.log(sum)


//4-cu mesele --- Bir string verilir, məsələn, "Vusal", və axtarılan string dəyəri seçilir, məsələn, "Vu". Verilmiş olan string-in içində axtarılan string varsa "true", yoxsa "false" qiymətini qaytarın.





// 5-ci mesele ---Bizdə {5, 3, 6, 1, 8, 11, 45, 76, 4} kimi bir array-imiz var. Bu array-i artan sıra ilə düzün.

let number = [5, 3, 6, 1, 8, 11, 45, 76, 4]

console.log(number.sort((a,b)=>a-b))







