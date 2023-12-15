func twoSum(nums []int, target int) []int {

    m := make(map[int]int)

    for i := 0; i < len(nums); i++ {
        temp := int(float64(target - nums[i]))
        if _, ok := m[temp]; ok {
            return []int{m[temp], i}
        } else {
            m[nums[i]] = i
        }
    }

    return nil
}