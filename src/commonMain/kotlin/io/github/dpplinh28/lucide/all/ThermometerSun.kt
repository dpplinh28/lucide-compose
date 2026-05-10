package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThermometerSun") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                arcToRelative(4f, 4f, 0f, false, false, -1.645f, 7.647f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 14.54f)
                arcToRelative(4f, 4f, 0f, true, true, -4f, 0f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.93f, 4.93f)
                lineToRelative(1.41f, 1.41f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.34f, 17.66f)
                lineToRelative(-1.41f, 1.41f)
            }
}

public val LucideIcons.All.ThermometerSunDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThermometerSun: ImageVector
    @Composable get() = ThermometerSunDefinition.asImageVector()
