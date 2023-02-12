public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        int searchNumber = 3;

        int _LPointer = 0;
        int _RPointer = arr.length - 1;
        int _MPointer = Math.round((_LPointer + _RPointer) / 2);

        while(_LPointer < _RPointer) {
            int valueOfPointer = arr[_MPointer];

            if(valueOfPointer  == searchNumber) {
                System.out.println("Search complete, data found in index " + _MPointer + " with value "+ arr[_MPointer]);
                return;
            } else if (searchNumber > valueOfPointer) {
                _LPointer = _MPointer + 1;
            } else if (searchNumber < valueOfPointer) {
                _RPointer = _MPointer - 1;
            }

            _MPointer = Math.round((_LPointer + _RPointer) / 2);
        }

        System.out.println("Data not found!");
    }

}