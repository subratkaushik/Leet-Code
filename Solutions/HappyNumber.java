static boolean isHappyNumber(int n) {
    HashSet<Integer> st = new HashSet<>();
    while (true) {
        n = numSquareSum(n);
        if (n == 1)
            return true;
        if (st.contains(n))
            return false;
        st.add(n);
    }
}
