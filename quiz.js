

function replace (lastWord,oldWord ,newWord ){
    let word = "laman";
    let i = 0;
    let newArray = [ ]

    while(i<word.length){
       newArray.push(lastWord[i]);
        i++
    }

    let j = 0;
    let arr = ""
    while(j<newArray.length){
        if(oldWord===arr[j]){
            arr+=oldWord
        }else{
            arr+=newArray[j]
        }

        j++
    }
    return arr
}
console.log(replace("laman","a","e"));
