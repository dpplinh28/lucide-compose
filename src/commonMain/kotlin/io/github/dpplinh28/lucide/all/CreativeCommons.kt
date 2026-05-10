package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreativeCommons") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 9.3f)
                arcToRelative(2.8f, 2.8f, 0f, false, false, -3.5f, 1f)
                arcToRelative(3.1f, 3.1f, 0f, false, false, 0f, 3.4f)
                arcToRelative(2.7f, 2.7f, 0f, false, false, 3.5f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 9.3f)
                arcToRelative(2.8f, 2.8f, 0f, false, false, -3.5f, 1f)
                arcToRelative(3.1f, 3.1f, 0f, false, false, 0f, 3.4f)
                arcToRelative(2.7f, 2.7f, 0f, false, false, 3.5f, 1f)
            }
}

public val LucideIcons.All.CreativeCommonsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreativeCommons: ImageVector
    @Composable get() = CreativeCommonsDefinition.asImageVector()
