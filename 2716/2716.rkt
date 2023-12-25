(define (minimized-string-length s)
  (define seen-chars (make-hash))
  (for ([char (string->list s)])
    (hash-set! seen-chars char #t))
  (hash-count seen-chars))