package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Unlink2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 7f)
                horizontalLineToRelative(2f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 10f)
                horizontalLineToRelative(-2f)
                moveToRelative(-6f, 0f)
                horizontalLineTo(7f)
                arcTo(5f, 5f, 0f, false, true, 7f, 7f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.Unlink2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Unlink2: ImageVector
    @Composable get() = Unlink2Definition.asImageVector()
