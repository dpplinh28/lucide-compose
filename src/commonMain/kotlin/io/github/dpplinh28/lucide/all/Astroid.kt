package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Astroid") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.983f, 21.186f)
                arcToRelative(1f, 1f, 0f, false, true, -1.966f, 0f)
                arcToRelative(10f, 10f, 0f, false, false, -8.203f, -8.203f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.966f)
                arcToRelative(10f, 10f, 0f, false, false, 8.203f, -8.203f)
                arcToRelative(1f, 1f, 0f, false, true, 1.966f, 0f)
                arcToRelative(10f, 10f, 0f, false, false, 8.203f, 8.203f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.966f)
                arcToRelative(10f, 10f, 0f, false, false, -8.203f, 8.203f)
            }
}

public val LucideIcons.All.AstroidDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Astroid: ImageVector
    @Composable get() = AstroidDefinition.asImageVector()
