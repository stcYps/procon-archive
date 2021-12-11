fn main() {
    proconio::input! { n: usize, mut d: [usize; n]}
    d.sort();
    d.dedup();
    let mut last = 101;
    let mut cnt = 0;
    loop {
        if d.len() == 0 {
            print!("{}", cnt);
            break;
        }
        if d[d.len() - 1] < last {
            last = d.pop().unwrap();
            cnt += 1;
        }
    }
}
