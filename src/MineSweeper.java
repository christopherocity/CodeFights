public class MineSweeper {

    private static int[][] minesweeper(boolean[][] matrix) {

        int[][] map = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (matrix[i][j]) {
                    if (i > 0 && i < map.length-1 && j > 0 && j < map[i].length-1) {
                        for (int k = i-1; k < i+2; k++) {
                            for (int l = j-1; l < j+2; l++) {
                                if (!(i==k && j==l))
                                    map[k][l]++;
                            }
                        }
                    }
                    if (j == 0 && i == 0) {
                        for (int k = i; k < 2; k++) {
                            for (int l = j; l < 2; l++) {
                                if (!(i==k && j==l))
                                    map[k][l]++;
                            }
                        }
                    }
                    if (i == map.length-1 && j == map[i].length-1) {
                        for (int k = i-1; k < i+1; k++) {
                            for (int l = j-1; l < j+1; l++) {
                                if (!(i==k && j==l))
                                    map[k][l]++;
                            }
                        }
                    }
                    if (i == 0 && j == map[i].length-1) {
                        for (int k = i; k < 2; k++) {
                            for (int l = j-1; l < j + 1; l++) {
                                if (!(i==k && j==l))
                                    map[k][l]++;
                            }
                        }
                    }
                    if (j == 0 && i == map.length-1) {
                        for (int k = i-1; k < i+1; k++) {
                            for (int l = j; l < j+2; l++) {
                                if (!(i==k && j==l))
                                    map[k][l]++;
                            }
                        }
                    }
                    if (i == 0 && j > 0 && j < map[i].length-1){
                        for (int k = i; k < i+2; k++) {
                            for (int l = j-1; l < j+2; l++) {
                                if (!(i==k && j==l))
                                    map[k][l]++;
                            }
                        }
                    }
                    if (j == 0 && i > 0 && i < map.length-1) {
                        for (int k = i-1; k < i+2; k++) {
                            for (int l = j; l < j+2; l++) {
                                if (!(i==k && j==l))
                                    map[k][l]++;
                            }
                        }
                    }
                    if (j == map[i].length-1 && i > 0 && i < map.length-1) {
                        for (int k = i-1; k < i+2; k++) {
                            for (int l = j-1; l < map[i].length; l++) {
                                if (!(i==k && j==l))
                                    map[k][l]++;
                            }
                        }
                    }
                    if (i == map.length-1 && j > 0 && j < map[i].length-1) {
                        for (int k = i-1; k < map.length; k++) {
                            for (int l = j-1; l < j+2; l++) {
                                if (!(i==k && j==l))
                                    map[k][l]++;
                            }
                        }
                    }
                }
            }
        }

        return map;

    }
}
