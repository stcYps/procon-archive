fn main() {
    proconio::input! { s: String }
    let mut near = 1000;
    for i in 0..s.len() - 2 {
        let p = (&s[i..i + 3].parse::<i32>().unwrap() - 753).abs();
        if p < near {
            near = p;
        }
    }
    print!("{}", near);
}
