package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Syringe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(18f, 2f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 7f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 9f)
                lineTo(8.7f, 19.3f)
                curveToRelative(-1f, 1f, -2.5f, 1f, -3.4f, 0f)
                lineToRelative(-.6f, -.6f)
                curveToRelative(-1f, -1f, -1f, -2.5f, 0f, -3.4f)
                lineTo(15f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 11f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 19f)
                lineToRelative(-3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 4f)
                lineToRelative(6f, 6f)
            }
}

public val LucideIcons.All.SyringeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Syringe: ImageVector
    @Composable get() = SyringeDefinition.asImageVector()
