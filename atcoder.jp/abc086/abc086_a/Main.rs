fn main() {
    proconio::input! {
        a: i32,
        b: i32,
    }

    let result;
    if a * b % 2 == 0 {
        result = "Even";
    } else {
        result = "Odd";
    }
    print!("{}", result);
}
