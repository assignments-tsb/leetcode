import intToRoman from './intToRoman'

describe('intToRoman', () => {
    it.each([
        [1, 'I'],
        [5, 'V'],
        [10, 'X'],
        [50, 'L'],
        [100, 'C'],
        [500, 'D'],
        [1000, 'M'],
    ])('convert the integer %p into a single-character roman numeral %p', (num: number, result: string) => {
        expect(intToRoman(num)).toBe(result);
    });

    it.each([
        [4, 'IV'],
        [9, 'IX'],
        [40, 'XL'],
        [90, 'XC'],
        [400, 'CD'],
        [900, 'CM'],
    ])('convert the subtract the previous digit', (num: number, result: string) => {
        expect(intToRoman(num)).toBe(result);
    });
})