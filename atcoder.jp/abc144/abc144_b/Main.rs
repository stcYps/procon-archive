fn main() {
    proconio::input! { n: usize }
    let mut result = "No";
    'outer: for i in 1..10 {
        for j in 1..10 {
            if i * j == n {
                result = "Yes";
                break 'outer;
            }
        }
    }
    print!("{}", result);
}
