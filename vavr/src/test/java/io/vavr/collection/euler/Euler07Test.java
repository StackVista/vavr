/*                        __    __  __  __    __  ___
 *                       \  \  /  /    \  \  /  /  __/
 *                        \  \/  /  /\  \  \/  /  /
 *                         \____/__/  \__\____/__/.ɪᴏ
 * ᶜᵒᵖʸʳᶦᵍʰᵗ ᵇʸ ᵛᵃᵛʳ ⁻ ˡᶦᶜᵉⁿˢᵉᵈ ᵘⁿᵈᵉʳ ᵗʰᵉ ᵃᵖᵃᶜʰᵉ ˡᶦᶜᵉⁿˢᵉ ᵛᵉʳˢᶦᵒⁿ ᵗʷᵒ ᵈᵒᵗ ᶻᵉʳᵒ
 */
package io.vavr.collection.euler;

import io.vavr.collection.Array;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Euler07Test {

    /**
     * <strong>Problem 7: 10001st prime</strong>
     * <p>
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     * <p>
     * What is the 10 001st prime number?
     * <p>
     * See also <a href="https://projecteuler.net/problem=7">projecteuler.net problem 7</a>.
     */
    @Test
    public void shouldSolveProblem7() {
        assertThat(prime(1)).isEqualTo(2);
        assertThat(prime(2)).isEqualTo(3);
        assertThat(prime(3)).isEqualTo(5);
        assertThat(prime(4)).isEqualTo(7);
        assertThat(prime(5)).isEqualTo(11);
        assertThat(prime(6)).isEqualTo(13);
        assertThat(prime(10_001)).isEqualTo(104_743);
    }

    private static final Array<Integer> PRIMES = Array.ofAll(PrimeNumbers.primes().take(10_001));

    private static long prime(int index) {
        return PRIMES.get(index - 1);
    }

}