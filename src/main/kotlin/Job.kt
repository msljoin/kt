class Job(role: String, id: Int) {
    var role: String? = null

    constructor(salary: Long, id: Int) {
        this.salary = salary
        this.id = id
    }

    var salary: Long = 0
    var id = 0
}