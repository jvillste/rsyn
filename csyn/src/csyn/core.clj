(ns csyn.core
  (:require [clojure.java.io :as io])
  (:import [jnr.ffi LibraryLoader]
           [java.io File]))

(definterface RSyn
  (^int double_input [^int number]))

(def rsyn (.load (LibraryLoader/create RSyn)
                 "rsyn"))

(.double_input rsyn 10)


