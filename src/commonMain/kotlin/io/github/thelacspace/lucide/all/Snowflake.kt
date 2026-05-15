package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Snowflake") { strokeWidth ->
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
                moveToRelative(14f, 20f)
                lineToRelative(1.25f, -2.5f)
                lineTo(18f, 18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 4f)
                lineToRelative(1.25f, 2.5f)
                lineTo(18f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 21f)
                lineToRelative(-3f, -6f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 3f)
                lineToRelative(-3f, 6f)
                lineToRelative(1.5f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(6.5f)
                lineTo(10f, 9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 10f)
                lineToRelative(-1.5f, 2f)
                lineToRelative(1.5f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                horizontalLineToRelative(-6.5f)
                lineTo(14f, 15f)
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
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.SnowflakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Snowflake: ImageVector
    @Composable get() = SnowflakeDefinition.asImageVector()
