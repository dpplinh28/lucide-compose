package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThermometerSnowflake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10f, 20f)
                lineToRelative(-1.25f, -2.5f)
                lineTo(6f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 4f)
                lineTo(8.75f, 6.5f)
                lineTo(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.585f, 15f)
                horizontalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(6.5f)
                lineTo(10f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 14.54f)
                arcToRelative(4f, 4f, 0f, true, true, -4f, 0f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(4f, 10f)
                lineToRelative(1.5f, 2f)
                lineTo(4f, 14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 21f)
                lineToRelative(3f, -6f)
                lineToRelative(-1.5f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 3f)
                lineToRelative(3f, 6f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.ThermometerSnowflakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThermometerSnowflake: ImageVector
    @Composable get() = ThermometerSnowflakeDefinition.asImageVector()
