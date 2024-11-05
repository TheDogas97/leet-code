function createCounter(n: number): () => number {
    let count: number = n;

    return () => count++;
}
