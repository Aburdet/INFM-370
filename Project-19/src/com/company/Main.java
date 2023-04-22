package com.company;

import java.util.Arrays;

public class Main {

    private static final int[] arr = {200,35,11,4,7,88,20,10,9,6};

    private static boolean isSorted(int[] array) {
        for (int i=1; i < array.length; i++) {
            if(array[i] < array[i-1]) {
                return false;
            }
        }
        return true;
    }

    private static void exch(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[i-1];
        array[i-1] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted: " + isSorted(arr));
        int i=1;
        if(arr[i] < arr[i-1]) {
            exch(arr, i, i-1);
        }
        if(arr[2] < arr[1]) {
            exch(arr, 2, 1);
            if(arr[1] < arr[0]) {
                exch(arr, 1, 0);
            }
        }
        if(arr[3] < arr[2]) {
            exch(arr, 3, 2);
            if(arr[2] < arr[1]) {
                exch(arr, 2, 1);
                if(arr[1] < arr[0]) {
                    exch(arr, 1, 0);
                }
            }
        }
        if(arr[4] < arr[3]) {
            exch(arr, 4, 3);
            if(arr[3] < arr[2]) {
                exch(arr, 3, 2);
                if(arr[2] < arr[1]) {
                    exch(arr, 2, 1);
                    if(arr[1] < arr[0]) {
                        exch(arr, 1, 0);
                    }
                }
            }
        }
        if(arr[5] < arr[4]) {
            exch(arr, 5, 4);
            if(arr[4] < arr[3]) {
                exch(arr, 4, 3);
                if(arr[3] < arr[2]) {
                    exch(arr, 3, 2);
                    if(arr[2] < arr[1]) {
                        exch(arr, 2, 1);
                        if(arr[1] < arr[0]) {
                            exch(arr, 1, 0);
                        }
                    }
                }
            }
        }
        if(arr[6] < arr[5]) {
            exch(arr, 6, 5);
            if(arr[5] < arr[4]) {
                exch(arr, 5, 4);
                if(arr[4] < arr[3]) {
                    exch(arr, 4, 3);
                    if(arr[3] < arr[2]) {
                        exch(arr, 3, 2);
                        if(arr[2] < arr[1]) {
                            exch(arr, 2, 1);
                            if(arr[1] < arr[0]) {
                                exch(arr, 1, 0);
                            }
                        }
                    }
                }
            }
        }
        if(arr[7] < arr[6]) {
            exch(arr, 7, 6);
            if(arr[6] < arr[5]) {
                exch(arr, 6, 5);
                if(arr[5] < arr[4]) {
                    exch(arr, 5, 4);
                    if(arr[4] < arr[3]) {
                        exch(arr, 4, 3);
                        if(arr[3] < arr[2]) {
                            exch(arr, 3, 2);
                            if(arr[2] < arr[1]) {
                                exch(arr, 2, 1);
                                if(arr[1] < arr[0]) {
                                    exch(arr, 1, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if(arr[8] < arr[7]) {
            exch(arr, 8, 7);
            if(arr[7] < arr[6]) {
                exch(arr, 7, 6);
                if(arr[6] < arr[5]) {
                    exch(arr, 6, 5);
                    if(arr[5] < arr[4]) {
                        exch(arr, 5, 4);
                        if(arr[4] < arr[3]) {
                            exch(arr, 4, 3);
                            if(arr[3] < arr[2]) {
                                exch(arr, 3, 2);
                                if(arr[2] < arr[1]) {
                                    exch(arr, 2, 1);
                                    if(arr[1] < arr[0]) {
                                        exch(arr, 1, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(arr[9] < arr[8]) {
            exch(arr, 9, 8);
            if(arr[8] < arr[7]) {
                exch(arr, 8, 7);
                if(arr[7] < arr[6]) {
                    exch(arr, 7, 6);
                    if(arr[6] < arr[5]) {
                        exch(arr, 6, 5);
                        if(arr[5] < arr[4]) {
                            exch(arr, 5, 4);
                            if(arr[4] < arr[3]) {
                                exch(arr, 4, 3);
                                if(arr[3] < arr[2]) {
                                    exch(arr, 3, 2);
                                    if(arr[2] < arr[1]) {
                                        exch(arr, 2, 1);
                                        if(arr[1] < arr[0]) {
                                            exch(arr, 1, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted: " + isSorted(arr));
    }
}
