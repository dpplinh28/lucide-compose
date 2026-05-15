package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9.34f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, false, false, -5.68f, -1.33f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.95f, 16.95f)
                arcTo(7f, 7f, 0f, false, true, 5f, 12f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.89f, 13.23f)
                arcTo(7f, 7f, 0f, false, false, 19f, 12f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, false, 5.12f, 2.12f)
            }
}

public val LucideIcons.All.MicOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicOff: ImageVector
    @Composable get() = MicOffDefinition.asImageVector()
