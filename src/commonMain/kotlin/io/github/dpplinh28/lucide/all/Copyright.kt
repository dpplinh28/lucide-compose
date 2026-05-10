package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Copyright") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.83f, 14.83f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, -5.66f)
            }
}

public val LucideIcons.All.CopyrightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Copyright: ImageVector
    @Composable get() = CopyrightDefinition.asImageVector()
