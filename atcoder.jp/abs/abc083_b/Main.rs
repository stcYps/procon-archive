fn main() {
    proconio::input! { n: usize, a: u32, b: u32}
    let mut ans = 0;
    for i in 1..n + 1 {
        let x: Vec<char> = i.to_string().chars().collect();
        let mut list: Vec<u32> = Vec::new();
        for i in 0..x.len() {
            list.push(x[i].to_digit(10).unwrap())
        }
        let sum = list.iter().fold(0, |sum, a| sum + a);
        if a <= sum && sum <= b {
            ans += i;
        }
    }
    print!("{}", ans);
}
