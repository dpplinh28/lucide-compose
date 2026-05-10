package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.1f, 2.182f)
                arcToRelative(10f, 10f, 0f, false, true, 3.8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.9f, 21.818f)
                arcToRelative(10f, 10f, 0f, false, true, -3.8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.609f, 3.721f)
                arcToRelative(10f, 10f, 0f, false, true, 2.69f, 2.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.182f, 13.9f)
                arcToRelative(10f, 10f, 0f, false, true, 0f, -3.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.279f, 17.609f)
                arcToRelative(10f, 10f, 0f, false, true, -2.7f, 2.69f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.818f, 10.1f)
                arcToRelative(10f, 10f, 0f, false, true, 0f, 3.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.721f, 6.391f)
                arcToRelative(10f, 10f, 0f, false, true, 2.7f, -2.69f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.391f, 20.279f)
                arcToRelative(10f, 10f, 0f, false, true, -2.69f, -2.7f)
            }
}

public val LucideIcons.All.CircleDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleDashed: ImageVector
    @Composable get() = CircleDashedDefinition.asImageVector()
