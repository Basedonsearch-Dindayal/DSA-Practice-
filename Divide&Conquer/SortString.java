public class SortString {
    public static void main(String[] args) {
        String[] arr = {
            "alpha", "zebra", "moon", "eclipse", "quantum",
            "nebula", "river", "mountain", "galaxy", "ocean",
            "forest", "sun", "earth", "comet", "mars",
            "gravity", "cloud", "saturn", "plasma", "aurora"
        };
        MergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    public static void MergeSort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            char c1 = arr[i].charAt(0);
            char c2 = arr[j].charAt(0);

            if (c1 < c2) {
                temp[k++] = arr[i++];
            } else if (c1 > c2) {
                temp[k++] = arr[j++];
            } else {
                char sc1 = arr[i].length() > 1 ? arr[i].charAt(1) : 0;
                char sc2 = arr[j].length() > 1 ? arr[j].charAt(1) : 0;

                if (sc1 <= sc2) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[si + x] = temp[x];
        }
    }

    public static void printArr(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}