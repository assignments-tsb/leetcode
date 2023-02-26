
let intValues = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
let strValues = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]

function intToRoman(num: number): string {
    let roman = "";

    for (let i=0; i<intValues.length; i++) {
        while (num >= intValues[i]) {
            num -= intValues[i]
            roman += strValues[i]
        }
    }

    return roman
}

export default intToRoman;