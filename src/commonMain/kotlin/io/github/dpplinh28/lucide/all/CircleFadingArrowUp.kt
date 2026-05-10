package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleFadingArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                arcToRelative(10f, 10f, 0f, false, true, 7.38f, 16.75f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 12f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                verticalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.5f, 8.875f)
                arcToRelative(10f, 10f, 0f, false, false, -.5f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.83f, 16f)
                arcToRelative(10f, 10f, 0f, false, false, 2.43f, 3.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.636f, 5.235f)
                arcToRelative(10f, 10f, 0f, false, true, .891f, -.857f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.644f, 21.42f)
                arcToRelative(10f, 10f, 0f, false, false, 7.631f, -.38f)
            }
}

public val LucideIcons.All.CircleFadingArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleFadingArrowUp: ImageVector
    @Composable get() = CircleFadingArrowUpDefinition.asImageVector()
