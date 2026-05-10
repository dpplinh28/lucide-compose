package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Settings2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 17f)
                horizontalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 7f)
                horizontalLineToRelative(-9f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.Settings2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Settings2: ImageVector
    @Composable get() = Settings2Definition.asImageVector()
