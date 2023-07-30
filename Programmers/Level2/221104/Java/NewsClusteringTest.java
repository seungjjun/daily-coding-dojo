import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewsClusteringTest {
  @Test
  void solution() {
    NewsClustering newsClustering = new NewsClustering();

    assertEquals(16384, newsClustering.solution("FRANCE", "french"));
  }
}