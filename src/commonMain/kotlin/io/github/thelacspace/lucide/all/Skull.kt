package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Skull") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12.5f, 17f)
                lineToRelative(-.5f, -1f)
                lineToRelative(-.5f, 1f)
                horizontalLineToRelative(1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 22f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, 1.56f, -3.25f)
                arcToRelative(8f, 8f, 0f, true, false, -11.12f, 0f)
                arcTo(2f, 2f, 0f, false, false, 8f, 20f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
}

public val LucideIcons.All.SkullDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Skull: ImageVector
    @Composable get() = SkullDefinition.asImageVector()
