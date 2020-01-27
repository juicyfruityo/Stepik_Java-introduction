public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
    Reader reader = new InputStreamReader(inputStream, charset);
    String res;
    StringWriter r = new StringWriter();
    int b = reader.read();
    while (b != -1) {
        r.write(b);
        b = reader.read();
    }
    res = r.toString();
    return res;
}
