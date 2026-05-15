package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RussianRuble") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 11f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -8f)
                horizontalLineTo(9f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 15f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.RussianRubleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RussianRuble: ImageVector
    @Composable get() = RussianRubleDefinition.asImageVector()
