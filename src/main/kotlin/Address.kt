class Address(mac: String?) {
    private var number = 0
    private var str: String? = null

    override fun toString(): String {
        return "Address(number=$number, str=$str)"
    }
}