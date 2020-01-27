public static int checkSumOfStream(InputStream inputStream) throws IOException {
    int res = 0;
    int n = inputStream.read();
    while (n > -1) {
        res = Integer.rotateLeft(res, 1) ^ n;
        n = inputStream.read();
    }
    return res;
}
