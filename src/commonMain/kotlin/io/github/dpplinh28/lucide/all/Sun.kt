package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sun") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.93f, 4.93f)
                lineToRelative(1.41f, 1.41f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17.66f, 17.66f)
                lineToRelative(1.41f, 1.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.34f, 17.66f)
                lineToRelative(-1.41f, 1.41f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.07f, 4.93f)
                lineToRelative(-1.41f, 1.41f)
            }
}

public val LucideIcons.All.SunDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sun: ImageVector
    @Composable get() = SunDefinition.asImageVector()
