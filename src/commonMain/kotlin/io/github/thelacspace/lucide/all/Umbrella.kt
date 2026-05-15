package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Umbrella") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.992f, 13f)
                arcToRelative(1f, 1f, 0f, false, false, .97f, -1.274f)
                arcToRelative(10.284f, 10.284f, 0f, false, false, -19.923f, 0f)
                arcTo(1f, 1f, 0f, false, false, 3f, 13f)
                close()
            }
}

public val LucideIcons.All.UmbrellaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Umbrella: ImageVector
    @Composable get() = UmbrellaDefinition.asImageVector()
