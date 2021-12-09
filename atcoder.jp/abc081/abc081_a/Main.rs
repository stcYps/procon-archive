fn main() {
    proconio::input! { s:String }
    print!("{}", s.chars().filter(|&x| x == '1').count())
}
