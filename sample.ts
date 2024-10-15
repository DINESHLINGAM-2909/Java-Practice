const s = "abcdef";
const k = 2;
console.log(rotateLeft(s, k));

function rotateLeft(s: string, k: number): string {
    let n = s.length;
    let rotateString= ""; 

   
    k = k % n;

 
    for (let i = k; i < n; i++) {
        rotateString += s[i];
    }

    
    for (let i = 0; i < k; i++) {
        rotateString += s[i];
    }

    return rotateString;
}
