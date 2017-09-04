import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber(10000, 99999); // created object and input range of five-digit numbers
        List<Long> listOfPrimeNumber = new ArrayList<>(primeNumber.getPrimeNumber());
        Palindrom maxPalindrom = new Palindrom();
        TreeMap<Long, List<Long>> listHashMap = maxPalindrom.getPalindrom(listOfPrimeNumber);
        System.out.println(listHashMap.toString());
    }
}


class Palindrom {

    public Palindrom() {
    }

    public boolean checkPalindrom(long palindrom) {
        long next = 0;
        long palindromCheck = palindrom;

        while(palindromCheck != 0) {
            next = (next*10) + (palindromCheck % 10); // make the number a palindrome
            palindromCheck /= 10;
        }

        if(palindrom == next) // check
            return true;
        else
            return false;
    }

    // function for find the maximum palindrome and two prime numbers
    public TreeMap<Long, List<Long>> getPalindrom(List<Long> list) {
        TreeMap<Long, List<Long>> hashMap = new TreeMap<>(); // map for maximum palindrome and two prime numbers

        for(int i = 0; i != list.size(); i++) {
            for (int j = 0; j != list.size(); j++) {
                long palindrom = list.get(i) * list.get(j); // multiplication of two primes

                if (checkPalindrom(palindrom)) {
                    List<Long> temporaryList = Arrays.asList(list.get(i), list.get(j));
                    if (hashMap.isEmpty())
                        hashMap.put(palindrom, temporaryList); // add palindrome number and two prime numbers
                    else {
                        if (palindrom > hashMap.firstKey()) { // equals new number of palindrome and palindrome in TreeSet
                            hashMap.clear();
                            hashMap.put(palindrom, Arrays.asList(list.get(i), list.get(j)));
                        } else
                            continue;
                    }

                }
            }
        }

        return hashMap; // return maximum palindrome and two prime numbers
    }
}

class PrimeNumber {
    List<Long> listForPrimeNumber = new ArrayList<>();
    long begin, end;

    public PrimeNumber(long begin, long end) {
        this.begin = begin;
        this.end = end;
    }

    // function for find prime numbers
    public List<Long> getPrimeNumber() {
        long divisor = 0; // number of dividers

        label: for(long i = begin ; i <= end; i++) { // sort out dividers in the specified range
            for(long j=1 ; j<=i; j++) {  	  // sort out dividers in the specified range
                if (i%j == 0) {    // check the divisibility of a number by an integer number
                    divisor++;  // consider dividers
                }
                if (divisor > 2) {  // check for optimization
                    divisor = 0;
                    continue label;	// back to the beginning of the cycle
                }
            }

            if (divisor == 2) {	//  number of dividers = 2
                listForPrimeNumber.add(i); // add in list the found number
            }

            divisor = 0; // number of dividers = 0
        }

        return listForPrimeNumber; // return list of prime numbers
    }
}
