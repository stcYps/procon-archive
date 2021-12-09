fn main() {
    proconio::input! { n: usize, mut a: [usize; n] }

    let mut cnt = 0;
    'outer: loop {
        for i in 0..a.len() {
            if a[i] % 2 != 0 {
                break 'outer;
            }
            a[i] /= 2;
        }
        cnt += 1;
    }
    print!("{}", cnt)
}
